package net.kanozo.service;

import java.util.List;

import net.kanozo.domain.BoardVO;
import net.kanozo.domain.Criteria;
import net.kanozo.domain.MainSlideItemVO;
import net.kanozo.domain.SampleFreeVO;
import net.kanozo.domain.SampleListVO;

public interface BoardService {
	// 글쓰기
	public void writeArticle(BoardVO board);

	// 글보기
	public BoardVO viewArticle(Integer id);

	// 글 리스트 보기
	public List<BoardVO> getArticleList(Criteria cri);

	// 글 수정하기
	public void updateArticle(BoardVO board);

	// 글 삭제하기
	public void deleteArticle(Integer id);

	// 글 갯수 가져오기
	public Integer countArticle(Criteria cri);

	// 글쓰기
	public void writeArticle2(BoardVO board);

	// 글보기
	public BoardVO viewArticle2(Integer id);

	// 글 수정하기
	public void updateArticle2(BoardVO board);

	// 글 리스트 보기
	public List<BoardVO> getArticleList2(Criteria cri);

	// 글 갯수 가져오기
	public Integer countArticle2(Criteria cri);

	public List<SampleListVO> sampleList();

	public List<SampleFreeVO> sampleFree();

	public List<MainSlideItemVO> getSlideItem();

}