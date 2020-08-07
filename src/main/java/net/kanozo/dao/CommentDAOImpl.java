package net.kanozo.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.kanozo.domain.ComVO;

@Repository
public class CommentDAOImpl implements CommentDAO {

	@Autowired
	SqlSession session;

	private final String namespace = "net.kanozo.mappers.CommentMapper";

	// 댓글 목록
	@Override
	public List<ComVO> list(Integer bno) {
		return session.selectList(namespace + ".listCom", bno);
	}

	// 댓글 작성
	public void insert(ComVO vo) {
		session.insert(namespace + ".insertComment", vo);
	}

	// 댓글 수정
	@Override
	public void update(ComVO vo) {

	}

	// 댓글 삭제
	public void delete(Integer rno) {

	}
}
