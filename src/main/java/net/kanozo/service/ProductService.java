package net.kanozo.service;

import java.util.ArrayList;

import net.kanozo.domain.ProductVO;

public interface ProductService {
	public ArrayList<ProductVO> allproductRetrieve();

	public ArrayList<ProductVO> productRetrieve(String productname);

//	public void productInsert(ProductVO productVO);

	public void productUpdate(int productid, String producttype, String productname, String explanation, int price,
			int inventory);

}
