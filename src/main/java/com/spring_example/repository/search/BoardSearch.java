package com.spring_example.repository.search;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.spring_example.domain.Board;

public interface BoardSearch {

    Page<Board> search1(Pageable pageable);

    Page<Board> searchAll(String[] types, String keyword, Pageable pageable);
}