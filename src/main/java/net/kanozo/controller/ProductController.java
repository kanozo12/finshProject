package net.kanozo.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.kanozo.domain.ProductVO;
import net.kanozo.service.ProductService;

@Controller
@RequestMapping("/prod/")
public class ProductController {

	@Autowired
	private ProductService service;

	@RequestMapping(value = "clubs", method = RequestMethod.GET)
	public String viewRegisterPage(Model model, HttpSession session) {

		ArrayList<ProductVO> products = (ArrayList<ProductVO>) service.allproductRetrieve();

		model.addAttribute("user", session.getAttribute("user"));
		model.addAttribute("products", products);

		return "prod/product.page";
	}

}
