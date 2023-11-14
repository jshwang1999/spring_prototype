package com.spring_example.service;

import com.spring_example.dto.BoardDTO;
import com.spring_example.dto.PageRequestDTO;
import com.spring_example.dto.PageResponseDTO;

public interface BoardService {

    Long register(BoardDTO boardDTO);

    BoardDTO readOne(Long bno);

    void modify(BoardDTO boardDTO);

    void remove(Long bno);

    PageResponseDTO<BoardDTO> list(PageRequestDTO pageRequestDTO);
}