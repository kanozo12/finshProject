package net.kanozo.dao;

import java.util.List;

import net.kanozo.domain.BoardVO;
import net.kanozo.domain.Criteria;
import net.kanozo.domain.NoticeVO;

public interface NoticeDAO {
	// 글을 쓰는 메서드
	public void write(NoticeVO noticeVO);

	// 글보기 메서드
	public NoticeVO view(Integer id);

	// 글 리스트 보기(몇번부터 몇개를 볼 것인지)
	public List<NoticeVO> list(Criteria cri);

	// 글 삭제
	public void delete(Integer id);

	// 글 수정
	public void update(NoticeVO noticeVO);
	
	// 글보기 메서드
	public NoticeVO selectUpdateDetail(Integer id);

	// 현재 글의 갯수
	public Integer getCnt(Criteria cri);
	
}
