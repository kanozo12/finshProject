package net.kanozo.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.kanozo.domain.ProductVO;

@Repository
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SqlSession session;

	private final String ns = "net.kanozo.mappers.ProductMapper";

	@Override
	public ArrayList<ProductVO> allproductRetrieve() {
		return session.selectOne(ns + ".allproductRetrieve");
	}

	@Override
	public ArrayList<ProductVO> productRetrieve(String productname) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public void productInsert(String producttype, String productname, String explanation, int price, int inventory) {
//		// TODO Auto-generated method stub
//
//	}

	@Override
	public void productUpdate(int productid, String producttype, String productname, String explanation, int price,
			int inventory) {
		// TODO Auto-generated method stub

	}

}
