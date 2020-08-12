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
import net.kanozo.domain.ProductVO;
import net.kanozo.service.ProductService;

@Controller
@RequestMapping("/prod/")
public class ProductController {
	
	private String this_page;
	
	@Autowired
	private ProductService service;

	@RequestMapping(value = "{productType}", method = RequestMethod.GET)
	public String viewRegisterPage(@PathVariable String productType, Model model, HttpSession session) {
		List<ProductVO> products = (ArrayList<ProductVO>) service.productRetrieve(productType);
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

	@RequestMapping(value = "take", method = RequestMethod.POST)
	public String addBasket(Model model, BasketVO basket) {
		
		service.addBasket(basket);
		
		return "redirect:/prod/" + this_page;
	}

}
