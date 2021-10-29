package co.kr.board.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.kr.board.VO.BoardVO;
import co.kr.board.service.BoardService;
import co.kr.board.service.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	public BoardMapper boardMapper;

	@Override
	public List<BoardVO> list(int page, String keyword, String type) {
		int amount = 10;
		HashMap<String, Object> param = new HashMap<String, Object>();
		param.put("startRn", (page-1)*amount);
		param.put("endRn", page*amount);
		param.put("keyword", keyword);
		param.put("type", type);
		return boardMapper.list(param);
	}

	@Override
	public int total(String keyword, String type) {
		HashMap<String, Object> param = new HashMap<String, Object>();
		param.put("keyword", keyword);
		param.put("type", type);
		return boardMapper.total(param);
	}
	
	
}
