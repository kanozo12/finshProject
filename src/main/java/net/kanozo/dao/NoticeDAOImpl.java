package net.kanozo.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.kanozo.domain.BoardVO;
import net.kanozo.domain.Criteria;
import net.kanozo.domain.NoticeVO;

@Repository
public class NoticeDAOImpl implements NoticeDAO {

	@Autowired
	private SqlSession session;

	private final String namespace = "net.kanozo.mappers.NoticeMapper";

	@Override
	public void write(NoticeVO noticeVO) {
		session.insert(namespace + ".writeProcedure", noticeVO);
	}

	@Override
	public NoticeVO view(Integer id) {
		return session.selectOne(namespace + ".view", id);
	}

	@Override
	public List<NoticeVO> list(Criteria cri) {
		return session.selectList(namespace + ".list", cri);
	}

	@Override
	public void delete(Integer id) {
		session.delete(namespace + ".delete", id);
	}

	@Override
	public void update(NoticeVO noticeVO) {
		session.update(namespace + ".update", noticeVO);
	}

	@Override
	public Integer getCnt(Criteria cri) {
		return session.selectOne(namespace + ".cnt", cri);
	}

	@Override
	public NoticeVO selectUpdateDetail(Integer id) {
		return session.selectOne(namespace + ".selectDetial", id);
	}
}
