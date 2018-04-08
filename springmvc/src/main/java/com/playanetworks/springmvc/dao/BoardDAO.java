package com.playanetworks.springmvc.dao;

import java.util.List;

import com.playanetworks.springmvc.vo.BoardVO;

public interface BoardDAO {
    public void create(BoardVO boardVO) throws Exception;

    public BoardVO read(Integer bNo) throws Exception;

    public void update(BoardVO boardVO) throws Exception;

    public void delete(Integer bNo) throws Exception;

    public List<BoardVO> listAll() throws Exception;
}
