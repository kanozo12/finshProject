package net.kanozo.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Optional;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import net.kanozo.domain.LoginDTO;
import net.kanozo.domain.RegisterDTO;
import net.kanozo.domain.UserVO;
import net.kanozo.service.UserService;
import net.kanozo.validator.RegisterValidator;

@Controller
@RequestMapping("/user/")
public class UserController {
	@Autowired
	private ServletContext context;

	@Autowired
	private UserService service;

	private RegisterValidator validator = new RegisterValidator();

	@RequestMapping(value = "register", method = RequestMethod.GET)
	public String viewRegisterPage(Model model) {
		model.addAttribute("registerDTO", new RegisterDTO());
		return "user/registerPage.page";
	}

	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String userRegist(RegisterDTO dto, Errors errors) throws Exception {
	

		return "redirect:/"; // 회원가입완료후 메인 페이지로 이동
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String userLogin(LoginDTO loginDTO, HttpSession session, Model model, HttpServletRequest req) {
		String msg = "로그인 실패, 아이디와 비밀번호를 확인하세요.";

		if (loginDTO.getUserType() == "" || loginDTO.getUserName() == "" || loginDTO.getPassword() == "") {
			model.addAttribute("msg", msg);
			return "user/login.page";
		}
		System.out.println(loginDTO);
		UserVO user = service.login(loginDTO.getUserType(), loginDTO.getUserName(), loginDTO.getPassword());
		
		if (user == null) {
			model.addAttribute("msg", msg);
			return "user/login.page";
		}

		session.setAttribute("user", user);
		System.out.println(user);

		return "redirect:/"; // 로그인 성공시 메인페이지로 리다이렉트
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String viewLoginPage(Model model) {
		model.addAttribute("loginDTO", new LoginDTO());
		return "user/login.page";
	}

	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String userLogout(HttpSession session, UserVO user, Model model) {
		session.removeAttribute("user");
		return "redirect:/";
	}

	@RequestMapping(value = "info", method = RequestMethod.GET)
	public String openProfile(HttpSession session, Model model) {

		return "user/info.page";
	}

	@RequestMapping(value = { "profile", "profile/{file:.+}" }, method = RequestMethod.GET)
	@ResponseBody
	public byte[] getUserProfile(@PathVariable Optional<String> file) throws IOException {
		String uploadPath = context.getRealPath("/WEB-INF/upload");
		String imgFile = "default.png";
		if (file.isPresent()) {
			imgFile = file.get();
		}
		try {
			File profile = new File(uploadPath + File.separator + file);
			FileInputStream in = new FileInputStream(profile);
			return IOUtils.toByteArray(in);
		} catch (FileNotFoundException e) {
			File profile = new File(uploadPath + File.separator + "default.png");
			FileInputStream in = new FileInputStream(profile);
			return IOUtils.toByteArray(in);
		}
	}

	@RequestMapping(value = "level/make", method = RequestMethod.GET)
	public String makeLevel(RedirectAttributes rttr) {
		service.fillLevelTable(200); // 200레벨 까지 경험치 생성
		rttr.addFlashAttribute("msg", "레벨 생성이 완료되었습니다.");
		return "redirect:/";
	}
}
