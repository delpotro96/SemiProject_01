package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BoardDAO;
import com.example.demo.paging.Criteria;
import com.example.demo.vo.BoardVO;

@Service
public class BoardService implements BoardDAO{

	@Autowired
	private BoardDAO boardDAO;
	
	@Override
	public void enroll(BoardVO boardVO) {
		boardDAO.enroll(boardVO);
		
	}

	@Override
	public List<BoardVO> getList() {
		return boardDAO.getList();
	}

	@Override
	public BoardVO getPage(int bno) {
		return boardDAO.getPage(bno);
	}

	@Override
	public List<BoardVO> getListPaging(Criteria cri) {
		// TODO Auto-generated method stub
		return boardDAO.getListPaging(cri);
	}

	@Override
	public int getTotal() {		
		return boardDAO.getTotal();
	}

}
