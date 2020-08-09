package net.kanozo.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import net.kanozo.domain.ProductVO;

@Repository
public interface ProductDAO {
	public ArrayList<ProductVO> allproductRetrieve();

	public ArrayList<ProductVO> productRetrieve(String productname);

//	public void productInsert(ProductVO productVO);

	public void productUpdate(int productid, String producttype, String productname, String explanation, int price,
			int inventory);
}
