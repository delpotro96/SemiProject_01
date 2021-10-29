package com.example.demo.service;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.demo.vo.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class BoardServiceTest {

	@Autowired
	BoardService boardService;
	
	@Test
	void contextLoads() {
		BoardVO boardVO = new BoardVO();
		
		boardVO.setTitle("service test");
		boardVO.setContent("service test");
		boardVO.setName("Service Test");
		
		boardService.postBoard(boardVO);
	}

}
