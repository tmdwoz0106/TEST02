package co.kr.board.service;

import java.util.List;

import co.kr.board.VO.BoardVO;

public interface BoardService {

	public List<BoardVO> list(int page, String keyword, String type);

	public int total(String keyword, String type);

}
