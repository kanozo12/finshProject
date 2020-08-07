package net.kanozo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.kanozo.dao.BoardDAO;
import net.kanozo.domain.BoardVO;
import net.kanozo.domain.Criteria;
import net.kanozo.domain.MainSlideItemVO;
import net.kanozo.domain.SampleFreeVO;
import net.kanozo.domain.SampleListVO;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDAO dao;

	@Override
	public void writeArticle(BoardVO board) {
		dao.write(board);
	}

	public BoardVO viewArticle(Integer id) {
		return dao.view(id);
	}

	public List<BoardVO> getArticleList(Criteria cri) {
		return dao.list(cri);
	}

	public void updateArticle(BoardVO board) {
		dao.update(board);
	}

	public void deleteArticle(Integer id) {
		dao.delete(id);
	}

	public Integer countArticle(Criteria cri) {
		return dao.getCnt(cri);
	}

	public void updateArticle2(BoardVO board) {
		dao.update2(board);
	}

	@Override
	public List<BoardVO> getArticleList2(Criteria cri) {
		return dao.list2(cri);
	}

	@Override
	public Integer countArticle2(Criteria cri) {
		return dao.getCnt2(cri);
	}

	@Override
	public void writeArticle2(BoardVO board) {
		dao.write2(board);
	}

	@Override
	public BoardVO viewArticle2(Integer id) {
		return dao.view2(id);
	}

	@Override
	public List<SampleListVO> sampleList() {
		return dao.sampleList();
	}
	
	@Override
	public List<SampleFreeVO> sampleFree() {
		return dao.sampleFree();
	}

	@Override
	public List<MainSlideItemVO> getSlideItem() {
		return dao.getSlideItem();
	}
}
