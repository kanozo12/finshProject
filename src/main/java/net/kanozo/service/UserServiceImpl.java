package net.kanozo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.kanozo.dao.UserDAO;
import net.kanozo.domain.OrderHistoryVO;
import net.kanozo.domain.UserVO;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDao;

	@Override
	public UserVO getUserInfo(String userid) {
		return userDao.getUser(userid);
	}

	@Override
	public UserVO login(String userType, String userid, String password) {
		return userDao.loginUser(userType, userid, password);
	}

	@Override
	public void register(UserVO user) {
		userDao.insertUser(user);
	}

	@Override
	public void fillLevelTable(Integer max) {
		userDao.deleteLevelTable(); // 레벨 데이터 삭제하고

		for (int i = 0; i <= max; i++) {
			Integer exp = (int) Math.floor(Math.pow(((double) i - 1) * 50 / 49, 2.5) * 10);
			userDao.insertLevelData(i, exp);
		}
	}

	@Override
	public UserVO appExp(String userid, Integer exp) {

		return null;
	}

	@Override
	public UserVO getCnt(String userid) {
		return userDao.getCnt(userid);
	}

	@Override
	public List<OrderHistoryVO> getOrderHistory(Integer userId) {
		return userDao.getOrderHistory(userId);
	}

}
