package net.kanozo.service;

import java.util.List;

import net.kanozo.domain.Criteria;
import net.kanozo.domain.NoticeVO;

public interface WriteNoticeService {
	// 글쓰기
	public void writeArticle(NoticeVO noticeVO);

	// 글보기
	public NoticeVO viewArticle(Integer id);

	// 글 리스트 보기
	public List<NoticeVO> getArticleList(Criteria cri);

	// 글 수정하기
	public void updateArticle(NoticeVO noticeVO);

	// 수정 상세정보
	public NoticeVO updateDetail(Integer id);

	// 글 삭제하기
	public void deleteArticle(Integer id);

	// 글 갯수 가져오기
	public Integer countArticle(Criteria cri);
}
