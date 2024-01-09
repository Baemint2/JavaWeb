package org.moz1mozi.b01.service;

import org.moz1mozi.b01.config.dto.BoardDTO;
import org.moz1mozi.b01.config.dto.BoardListReplyCountDTO;
import org.moz1mozi.b01.config.dto.PageRequestDTO;
import org.moz1mozi.b01.config.dto.PageResponseDTO;

public interface BoardService {

    Long register(BoardDTO boardDTO);

    BoardDTO readOne(Long bno);

    void modify(BoardDTO boardDTO);

    void remove(Long bno);

    PageResponseDTO<BoardDTO> list(PageRequestDTO pageRequestDTO);

    //댓글의 숫자까지 처리
    PageResponseDTO<BoardListReplyCountDTO> listWithReplyCount(PageRequestDTO pageRequestDTO);
}
