package net.kanozo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kanozo.domain.ProductVO;

@Repository
public interface ProductDAO {
	public List<ProductVO> allproductRetrieve();

	public ArrayList<ProductVO> productRetrieve(String productname);

//	public void productInsert(ProductVO productVO);

	public void productUpdate(int productid, String producttype, String productname, String explanation, int price,
			int inventory);
}
