package com.example.board.board.service;

import com.example.board.board.dto.BoardDTO;
import com.example.board.board.entity.BoardEntity;
import com.example.board.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

// DTO -> Entity (Entity Class 에서)
// Entity -> DTO (DTO Class 에서)

@Service
@RequiredArgsConstructor

public class BoardService {
    private final BoardRepository boardRepository;

    public void save(BoardDTO boardDTO) {
        BoardEntity boardEntity = BoardEntity.toSaveEntity(boardDTO);
        boardRepository.save(boardEntity);
    }
}
