package com.spring_example.service;

import com.spring_example.dto.PageRequestDTO;
import com.spring_example.dto.PageResponseDTO;
import com.spring_example.dto.ReplyDTO;

public interface ReplyService {

    Long register(ReplyDTO replyDTO);

    ReplyDTO read(Long rno);

    void modify(ReplyDTO replyDTO);

    void remove(Long rno);

    PageResponseDTO<ReplyDTO> getListOfBoard(Long bno, PageRequestDTO pageRequestDTO);

}