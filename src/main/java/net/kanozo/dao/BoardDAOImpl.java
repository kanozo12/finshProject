package net.kanozo.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.kanozo.domain.BoardVO;
import net.kanozo.domain.Criteria;
import net.kanozo.domain.MainSlideItemVO;
import net.kanozo.domain.SampleFreeVO;
import net.kanozo.domain.SampleListVO;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Autowired
	private SqlSession session;

	private final String namespace = "net.kanozo.mappers.BoardMapper";

	@Override
	public void write(BoardVO data) {
		session.insert(namespace + ".write", data);
	}

	@Override
	public BoardVO view(Integer id) {
		return session.selectOne(namespace + ".view", id);
	}

	@Override
	public List<BoardVO> list(Criteria cri) {
		return session.selectList(namespace + ".list", cri);
	}

	@Override
	public void delete(Integer id) {
		session.delete(namespace + ".delete", id);
	}

	@Override
	public void update(BoardVO data) {
		session.update(namespace + ".update", data);
	}

	@Override
	public Integer getCnt(Criteria cri) {
		return session.selectOne(namespace + ".cnt", cri);
	}

	@Override
	public void write2(BoardVO data) {
		session.insert(namespace + ".write2", data);
	}

	@Override
	public void update2(BoardVO data) {
		session.update(namespace + ".update2", data);
	}
	
	@Override
	public List<BoardVO> list2(Criteria cri) {
		return session.selectList(namespace + ".list2", cri);
	}

	@Override
	public Integer getCnt2(Criteria cri) {
		return session.selectOne(namespace + ".cnt2", cri);
	}
	
	@Override
	public BoardVO view2(Integer id) {
		return session.selectOne(namespace + ".view2", id);
	}

	@Override
	public List<SampleListVO> sampleList() {
		return session.selectList(namespace + ".sampleList"); 
	}
	
	@Override
	public List<SampleFreeVO> sampleFree() {
		return session.selectList(namespace + ".sampleFree");
	}

	@Override
	public List<MainSlideItemVO> getSlideItem() {
		return session.selectList(namespace + ".slideItem");
	}
}
