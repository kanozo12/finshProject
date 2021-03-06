package net.kanozo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.kanozo.dao.ProductDAO;
import net.kanozo.domain.BasketVO;
import net.kanozo.domain.OrderHistoryVO;
import net.kanozo.domain.PaymentInfoVO;
import net.kanozo.domain.PaymentVO;
import net.kanozo.domain.ProductVO;
import net.kanozo.domain.UserBasketVO;

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

	@Override
	public int checkBasket(Integer userId) {
		return productDAO.checkBasket(userId);

	}

	@Override
	public void cleanBasket(Integer userId) {
		productDAO.cleanBasket(userId);
	}

	@Override
	public List<UserBasketVO> getBasket(Integer userId) {
		return productDAO.getBasket(userId);
	}

	@Override
	public List<PaymentInfoVO> getPaymentInfo(Integer userId) {
		return productDAO.getPaymentInfo(userId);
	}

	@Override
	public void addPayment(PaymentVO vo) {
		productDAO.addPayment(vo);

	}

	@Override
	public void productUpdate(int productid, String producttype, String productname, String explanation, int price,
			int inventory) {
		// TODO Auto-generated method stub

	}

}
