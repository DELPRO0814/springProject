package kr.ezen.bbs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.ezen.bbs.domain.BoardDTO;

@Mapper
public interface BoardMapper {
	// 게시글 등록
	public void insert(BoardDTO dto);

	// 게시글 리스트
	public List<BoardDTO> getList();
}
