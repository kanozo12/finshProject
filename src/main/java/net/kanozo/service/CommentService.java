package net.kanozo.service;

import java.util.List;

import net.kanozo.domain.ComVO;

public interface CommentService {
	// 댓글 목록
	public List<ComVO> list(Integer bno);

	// 댓글 입력
	public void insert(ComVO vo);

	// 댓글 수정
	public void delete(ComVO vo);

	// 댓글 삭제
	public void update(Integer rno);

}
