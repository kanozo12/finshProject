package net.kanozo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.kanozo.domain.BasketVO;
import net.kanozo.domain.PaymentInfoVO;
import net.kanozo.domain.PaymentVO;
import net.kanozo.domain.ProductVO;
import net.kanozo.domain.SummeryVO;
import net.kanozo.domain.UserBasketVO;
import net.kanozo.domain.UserVO;
import net.kanozo.service.ProductService;

@Controller
@RequestMapping("/prod/")
public class ProductController {

	private String this_page;

	@Autowired
	private ProductService service;

	@RequestMapping(value = "clubs/{productType}", method = RequestMethod.GET)
	public String viewRegisterPage(@PathVariable String productType, Model model, HttpSession session) {
		List<ProductVO> products = (List<ProductVO>) service.productRetrieve(productType);
		ProductVO vo = new ProductVO();
		for (int i = 0; i < products.size(); i++) {
			vo = products.get(i);
		}

		this_page = productType;

		model.addAttribute("category", vo.getProductType());

		model.addAttribute("user", session.getAttribute("user"));
		model.addAttribute("products", products);

		return "prod/product.page";
	}

	@RequestMapping(value = "detail/{id}", method = RequestMethod.GET)
	public String viewArticle(@PathVariable Integer id, Model model) {

		ProductVO products = service.productGetDetail(id);

		model.addAttribute("products", products);

		return "prod/productDetail.page";
	}

	@RequestMapping(value = "basket", method = RequestMethod.GET)
	public String getBasket(Model model, HttpSession session) {

		UserVO user = (UserVO) session.getAttribute("user");

		List<UserBasketVO> ubasket = (List<UserBasketVO>) service.getBasket(user.getUserId());

		double totalPrice = 0;
		double totalDiscount = 0;
		double percent = 30;

		for (int i = 0; i < ubasket.size(); i++) {
			UserBasketVO summery = ubasket.get(i);
			totalPrice += summery.getPrice();
			totalDiscount += sale(summery.getPrice(), percent);
		}

		SummeryVO summery = new SummeryVO();
		summery.setTotalPrice(totalPrice);
		summery.setTotalDiscount(totalDiscount);

		model.addAttribute("summery", summery);
		model.addAttribute("basket", ubasket);

		return "prod/basket.page";
	}

	public static double sale(double money, double percent) {
		double M3 = percent * 0.01;
		double yourmoney = money * M3;
		return yourmoney;
	}

	@RequestMapping(value = "take", method = RequestMethod.POST)
	public String addBasket(Model model, BasketVO basket) {

		service.addBasket(basket);

		return "redirect:/";
	}

	@RequestMapping(value = "payment", method = RequestMethod.GET)
	public String getPayment(Model model, HttpSession session, PaymentInfoVO payment) {
		UserVO user = (UserVO) session.getAttribute("user");

		List<UserBasketVO> ubasket = (List<UserBasketVO>) service.getBasket(user.getUserId());

		List<PaymentInfoVO> paymentInfo = (List<PaymentInfoVO>) service.getPaymentInfo(user.getUserId());
		System.out.println(paymentInfo);
		model.addAttribute("paymentInfo", paymentInfo);

		double totalPrice = 0;
		double totalDiscount = 0;
		double percent = 30;

		for (int i = 0; i < ubasket.size(); i++) {
			UserBasketVO summery = ubasket.get(i);
			totalPrice += summery.getPrice();
			totalDiscount += sale(summery.getPrice(), percent);
		}

		SummeryVO summery = new SummeryVO();
		summery.setTotalPrice(totalPrice);
		summery.setTotalDiscount(totalDiscount);

		model.addAttribute("summery", summery);
		model.addAttribute("basket", ubasket);

		return "prod/payment.page";
	}

	@RequestMapping(value = "payment", method = RequestMethod.POST)
	public String postPayment(Model model, PaymentVO vo, HttpSession session) {
		UserVO user = (UserVO) session.getAttribute("user");
		List<PaymentInfoVO> paymentInfo = (List<PaymentInfoVO>) service.getPaymentInfo(user.getUserId());

		for (int i = 0; i < paymentInfo.size(); i++) {
			PaymentVO payment = new PaymentVO();
			payment.setUserId(user.getUserId());
			payment.setProductId(Integer.parseInt(paymentInfo.get(i).getProductId()));
			payment.setNumbers(Integer.parseInt(paymentInfo.get(i).getNumbers()));
			payment.setAddress(vo.getAddress());
			payment.setContact(vo.getContact());
			payment.setCreditcardnumber(vo.getCreditcardnumber());
			payment.setCreditcardpassword(vo.getCreditcardpassword());

			service.addPayment(payment);
		}

		service.cleanBasket(user.getUserId());
		return "redirect:/";
	}
	
	

}
