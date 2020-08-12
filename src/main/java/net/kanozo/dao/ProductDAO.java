package net.kanozo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import net.kanozo.domain.BasketVO;
import net.kanozo.domain.OrderHistoryVO;
import net.kanozo.domain.PaymentInfoVO;
import net.kanozo.domain.PaymentVO;
import net.kanozo.domain.ProductVO;
import net.kanozo.domain.UserBasketVO;

@Repository
public interface ProductDAO {
	public List<ProductVO> productRetrieve(String productType);

	public ProductVO productGetDetail(Integer id);

	public void addBasket(BasketVO vo);

	public void cleanBasket(Integer userId);
	
	public List<UserBasketVO> getBasket(Integer userId);
	
	public List<PaymentInfoVO> getPaymentInfo(Integer userId);
	
	public void addPayment(PaymentVO vo);

	public void productUpdate(int productid, String producttype, String productname, String explanation, int price,
			int inventory);
	
	
}
