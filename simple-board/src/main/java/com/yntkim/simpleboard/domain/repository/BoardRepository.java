package com.yntkim.simpleboard.domain.repository;

import com.yntkim.simpleboard.domain.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
}
