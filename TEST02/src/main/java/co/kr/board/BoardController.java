package co.kr.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.kr.board.VO.BoardVO;
import co.kr.board.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	public BoardService boardService;

	// -----------------------시작 리스트 페이지-------------------
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String BoardList() {

		return "board/list";
	}

	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	public ModelAndView Board_List(int page, String keyword, String type) {
		ModelAndView json = new ModelAndView("jsonView");
		List<BoardVO> list = boardService.list(page,keyword,type);
		int endPage = (int)(Math.ceil(page*1.0/10))*10;
		int startPage = endPage - 9;
		if(startPage <= 0) {
			startPage = 1;
		}
		int total = boardService.total(keyword,type);
		int totalPage = (int)(Math.ceil(total*1.0/10));
		if(endPage > totalPage) {
			endPage = totalPage;
		}
		
		boolean prev = page > 1;
		boolean next = page < endPage;
		
		json.addObject("list", list);
		json.addObject("endPage", endPage);
		json.addObject("startPage", startPage);
		json.addObject("prev", prev);
		json.addObject("next", next);
		return json;
	}
}
