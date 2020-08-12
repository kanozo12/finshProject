package net.kanozo.controller;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.kanozo.domain.LoginDTO;
import net.kanozo.domain.OrderHistoryVO;
import net.kanozo.domain.RegisterDTO;
import net.kanozo.domain.UserVO;
import net.kanozo.service.ProductService;
import net.kanozo.service.UserService;
import net.kanozo.validator.RegisterValidator;

@Controller
@RequestMapping("/user/")
public class UserController {
	@Autowired
	private ServletContext context;

	@Autowired
	private UserService service;

	@Autowired
	private ProductService pService;

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

	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String userLogout(HttpSession session, UserVO user, Model model) {
		session.removeAttribute("user");
		return "redirect:/";
	}

	@RequestMapping(value = "order/history", method = RequestMethod.GET)
	public String orderHistory(Model model, HttpSession session) {
		UserVO user = (UserVO) session.getAttribute("user");

		List<OrderHistoryVO> list = (List<OrderHistoryVO>) service.getOrderHistory(user.getUserId());

		model.addAttribute("list", list);
		return "user/history.page";
	}
}