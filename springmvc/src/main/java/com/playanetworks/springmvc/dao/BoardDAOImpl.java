package com.playanetworks.springmvc.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.playanetworks.springmvc.vo.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {

    @Inject
    private SqlSession    sqlSession;
    private static String namespace = "com.playanetworks.springmvc.BoardMapper";

    @Override
    public void create(BoardVO boardVO) throws Exception {
        sqlSession.insert(namespace + ".create", boardVO);
    }

    @Override
    public BoardVO read(Integer bNo) throws Exception {
        return sqlSession.selectOne(namespace + ".read", bNo);
    }

    @Override
    public void update(BoardVO boardVO) throws Exception {
        sqlSession.update(namespace + ".update", boardVO);
    }

    @Override
    public void delete(Integer bNo) throws Exception {
        sqlSession.delete(namespace + ".delete", bNo);
    }

    @Override
    public List<BoardVO> listAll() throws Exception {
        return sqlSession.selectList(namespace + ".listAll");
    }

}
