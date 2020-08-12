package net.kanozo.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.kanozo.domain.BasketVO;
import net.kanozo.domain.OrderHistoryVO;
import net.kanozo.domain.PaymentInfoVO;
import net.kanozo.domain.PaymentVO;
import net.kanozo.domain.ProductVO;
import net.kanozo.domain.UserBasketVO;

@Repository
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SqlSession session;

	private final String ns = "net.kanozo.mappers.ProductMapper";

	@Override
	public List<ProductVO> productRetrieve(String productType) {
		return session.selectList(ns + ".productRetrieve", productType);
	}

	@Override
	public ProductVO productGetDetail(Integer id) {
		return session.selectOne(ns + ".productGetDetail", id);
	}

	@Override
	public void addBasket(BasketVO vo) {
		session.insert(ns + ".addBasket", vo);
	}

	@Override
	public void cleanBasket(Integer userId) {
		session.update(ns + ".cleanBasket", userId);

	}

	@Override
	public List<UserBasketVO> getBasket(Integer userId) {
		return session.selectList(ns + ".selectBasket", userId);
	}

	@Override
	public List<PaymentInfoVO> getPaymentInfo(Integer userId) {
		return session.selectList(ns + ".selectPaymentInfo", userId);
	}

	@Override
	public void addPayment(PaymentVO vo) {
		session.insert(ns + ".addPayment", vo);

	}



	@Override
	public void productUpdate(int productid, String producttype, String productname, String explanation, int price,
			int inventory) {
		// TODO Auto-generated method stub

	}

}
