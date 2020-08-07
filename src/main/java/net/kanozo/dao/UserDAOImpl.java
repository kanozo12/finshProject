package net.kanozo.dao;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.kanozo.domain.UserVO;

@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	private SqlSession session;

	private final String ns = "net.kanozo.mappers.UserMapper";

	@Override
	public UserVO getUser(String userid) {
		return session.selectOne(ns + ".selectUser", userid);
	}

	@Override
	public UserVO loginUser(String userType, String userName, String password) {
		Map<String, String> loginMap = new HashMap<String, String>();
		loginMap.put("userType", userType);
		loginMap.put("userName", userName);
		loginMap.put("password", password);

		return session.selectOne(ns + ".loginUser", loginMap);
	}

	@Override
	public void insertUser(UserVO user) {
		session.insert(ns + ".insertUser", user);
	}

	@Override
	public void deleteLevelTable() {
		session.delete(ns + ".clearData");
	}

	@Override
	public void insertLevelData(Integer level, Integer exp) {
		Map<String, Integer> levelMap = new HashMap<String, Integer>();
		levelMap.put("level", level);
		levelMap.put("exp", exp);

		session.insert(ns + ".levelData", levelMap);
	}

	@Override
	public Integer getRequireExp(Integer level) {
		return session.selectOne(ns + ".requireExp", level);
	}
	
	@Override
	public void setLevelAndExp(UserVO user) {
		session.update(ns + ".setLevelAndExp", user);
	}
	
	@Override
	public UserVO getCnt(String userid) {
		return session.selectOne(ns + ".selectWriteCnt", userid);
	}
}
