package com.workwith.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.workwith.vo.BoardVO;

public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardMapper mapper;
	
	@Override
	public List<BoardVO> getList() {
		
		return mapper.getList;
	}
	
}
