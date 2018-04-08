package com.playanetworks.springmvc.service;

import java.util.List;

import com.playanetworks.springmvc.vo.BoardVO;

public interface BoardService {
    public void regist(BoardVO board) throws Exception;

    public BoardVO read(Integer bNo) throws Exception;

    public void modify(BoardVO board) throws Exception;

    public void remove(Integer bNo) throws Exception;

    public List<BoardVO> listAll() throws Exception;
}
