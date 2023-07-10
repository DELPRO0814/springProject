package kr.ezen.bbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ezen.bbs.domain.BoardDTO;
import kr.ezen.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardService service;

	@RequestMapping("/list.do")
	public String list(Model model) {
		List<BoardDTO> list = service.getList();
		model.addAttribute("list", list);

		return "board/boardList";
	}

	@GetMapping("/register.do")
	public String register() {

		return "board/register";
	}

	@PostMapping("/register.do")
	public String register(BoardDTO dto) {
		if (!dto.getSubject().equals("") && !dto.getContents().equals("") && !dto.getWriter().equals("")) {
			service.register(dto);
			return "redirect:/board/list.do";
		}
		return "board/register";
	}
}
