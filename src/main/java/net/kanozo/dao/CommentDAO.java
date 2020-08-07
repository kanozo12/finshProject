package net.kanozo.dao;

import java.util.List;

import net.kanozo.domain.ComVO;

public interface CommentDAO {
	// 댓글 목록
	public List<ComVO> list(Integer bno);

	// 댓글 입력
	public void insert(ComVO vo);

	// 댓글 수정
	public void update(ComVO vo);

	// 댓글 삭제
	public void delete(Integer cno);
}
