package net.kanozo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.kanozo.dao.NoticeDAO;
import net.kanozo.domain.Criteria;
import net.kanozo.domain.NoticeVO;

@Service
public class WriteNoticeServiceImpl implements WriteNoticeService {
	@Autowired
	private NoticeDAO dao;

	@Override
	public void writeArticle(NoticeVO noticeVO) {
		dao.write(noticeVO);
	}

	public NoticeVO viewArticle(Integer id) {
		return dao.view(id);
	}

	public List<NoticeVO> getArticleList(Criteria cri) {
		return dao.list(cri);
	}

	public void updateArticle(NoticeVO noticeVO) {
		dao.update(noticeVO);
	}

	public void deleteArticle(Integer id) {
		dao.delete(id);
	}

	public Integer countArticle(Criteria cri) {
		return dao.getCnt(cri);
	}

	@Override
	public NoticeVO updateDetail(Integer id) {
		return dao.selectUpdateDetail(id);
	}


}
