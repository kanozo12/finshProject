package net.kanozo.service;

import java.util.List;

import net.kanozo.domain.OrderHistoryVO;
import net.kanozo.domain.RegisterVO;
import net.kanozo.domain.UserVO;

public interface UserService {
	public UserVO login(String userType, String usrid, String password);

	public void insertUser(RegisterVO vo);

	public UserVO getUserInfo(String userid);

	// 레벨 테이블 채워주기
	public void fillLevelTable(Integer max);

	// 회원에게 경험치 추가하기
	public UserVO appExp(String userid, Integer exp);

	public UserVO getCnt(String userid);

	public List<OrderHistoryVO> getOrderHistory(Integer userId);
}
