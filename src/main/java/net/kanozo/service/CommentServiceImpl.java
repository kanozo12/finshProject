package net.kanozo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.kanozo.dao.CommentDAO;
import net.kanozo.domain.ComVO;

@Service
public class CommentServiceImpl implements CommentService {
	@Autowired
	CommentDAO comDAO;

	// 댓글 목록
	@Override
	public List<ComVO> list(Integer bno) {
		return comDAO.list(bno);
	}

	// 댓글 작성
	@Override
	public void insert(ComVO vo) {
		comDAO.insert(vo);
	}

	// 댓글 수정
	@Override
	public void update(Integer rno) {

	}

	// 댓글 삭제
	@Override
	public void delete(ComVO vo) {

	}
}
