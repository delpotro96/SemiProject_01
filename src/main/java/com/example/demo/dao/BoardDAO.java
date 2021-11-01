package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.paging.Criteria;
import com.example.demo.vo.BoardVO;

@Repository
@Mapper
public interface BoardDAO {
	
	public void enroll(BoardVO boardVO);
	
	public List<BoardVO> getList();
	
	public BoardVO getPage(int bno);
	
	/* 페이징 게시판 목록 */
	public List<BoardVO> getListPaging(Criteria cri);
}
