package com.workwith.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.workwith.vo.BoardVO;

@Controller
public class BoardController {
	
	@RequestMapping("/getList")
	public List<BoardVO> getList() {
		List<BoardVO> boardList = new ArrayList<>();

		for(BoardVO boardVO : boardList) {
			boardVO.setBoardNum("boardNum");
			boardVO.setBoardTitle("boardTitle");
			boardVO.setBoardContent("boardContent");
			boardVO.setBoardDate("boardDate");
			boardVO.setBoardContent("boardVisit");
			
			boardList.add(boardVO);
		}
	
		return boardList;
	}
}
