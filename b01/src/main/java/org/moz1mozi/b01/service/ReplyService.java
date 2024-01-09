package org.moz1mozi.b01.service;

import org.moz1mozi.b01.config.dto.PageRequestDTO;
import org.moz1mozi.b01.config.dto.PageResponseDTO;
import org.moz1mozi.b01.config.dto.ReplyDTO;

public interface ReplyService {

    Long register(ReplyDTO replyDTO);

    ReplyDTO read(Long rno);

    void modify(ReplyDTO replyDTO);

    void remove(Long rno);

    PageResponseDTO<ReplyDTO> getListOfBoard(Long bno, PageRequestDTO pageRequestDTO);
}
