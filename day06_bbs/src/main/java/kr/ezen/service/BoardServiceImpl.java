package kr.ezen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ezen.bbs.domain.BoardDTO;
import kr.ezen.bbs.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardMapper mapper;

	@Override
	public void register(BoardDTO dto) {
		mapper.insert(dto);
	}

	@Override
	public List<BoardDTO> getList() {
		// TODO Auto-generated method stub
		return mapper.getList();
	}

}
