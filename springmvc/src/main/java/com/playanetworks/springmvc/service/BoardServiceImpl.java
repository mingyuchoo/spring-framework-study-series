package com.playanetworks.springmvc.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.playanetworks.springmvc.dao.BoardDAO;
import com.playanetworks.springmvc.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {
    @Inject
    private BoardDAO boardDao;

    @Override
    public void regist(BoardVO board) throws Exception {
        boardDao.create(board);
    }

    @Override
    public BoardVO read(Integer bNo) throws Exception {
        return boardDao.read(bNo);
    }

    @Override
    public void modify(BoardVO board) throws Exception {
        boardDao.update(board);
    }

    @Override
    public void remove(Integer bNo) throws Exception {
        boardDao.delete(bNo);
    }

    @Override
    public List<BoardVO> listAll() throws Exception {
        return boardDao.listAll();
    }

}
