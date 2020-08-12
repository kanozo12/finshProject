package net.kanozo.service;

import java.util.List;

import net.kanozo.domain.ProductVO;

public interface ProductService {
	public List<ProductVO> productRetrieve(String productType);

	public ProductVO productGetDetail(Integer id);

	public void productUpdate(int productid, String producttype, String productname, String explanation, int price,
			int inventory);

}
