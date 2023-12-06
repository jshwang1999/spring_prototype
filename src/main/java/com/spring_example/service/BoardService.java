package com.spring_example.service;

import com.spring_example.dto.BoardDTO;
import com.spring_example.dto.BoardListReplyCountDTO;
import com.spring_example.dto.PageRequestDTO;
import com.spring_example.dto.PageResponseDTO;

public interface BoardService {

    Long register(BoardDTO boardDTO);

    BoardDTO readOne(Long bno);

    void modify(BoardDTO boardDTO);

    void remove(Long bno);

    PageResponseDTO<BoardDTO> list(PageRequestDTO pageRequestDTO);

    //댓글의 숫자까지 처리
    PageResponseDTO<BoardListReplyCountDTO> listWithReplyCount(PageRequestDTO pageRequestDTO);
}