package net.kanozo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.kanozo.dao.ProductDAO;
import net.kanozo.domain.BasketVO;
import net.kanozo.domain.ProductVO;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO productDAO;

	@Override
	public List<ProductVO> productRetrieve(String productType) {
		return productDAO.productRetrieve(productType);
	}

	@Override
	public ProductVO productGetDetail(Integer id) {
		return productDAO.productGetDetail(id);
	}

	@Override
	public void addBasket(BasketVO vo) {
		productDAO.addBasket(vo);
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
