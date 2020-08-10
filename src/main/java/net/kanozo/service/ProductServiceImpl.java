package net.kanozo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.kanozo.dao.ProductDAO;
import net.kanozo.domain.ProductVO;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO productDAO;

	@Override
	public List<ProductVO> allproductRetrieve() {
		return productDAO.allproductRetrieve();
	}

	@Override
	public ArrayList<ProductVO> productRetrieve(String productname) {
		return productDAO.productRetrieve(productname);
	}

//	@Override
//	public Object productInsert(ProductVO productVO) {
//		return productDAO.productInsert(productVO);
//
//	}

	@Override
	public void productUpdate(int productid, String producttype, String productname, String explanation, int price,
			int inventory) {
		// TODO Auto-generated method stub

	}

}
