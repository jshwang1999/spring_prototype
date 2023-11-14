package com.spring_example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring_example.domain.Board;
import com.spring_example.repository.search.BoardSearch;

public interface BoardRepository extends JpaRepository<Board, Long>, BoardSearch {


}