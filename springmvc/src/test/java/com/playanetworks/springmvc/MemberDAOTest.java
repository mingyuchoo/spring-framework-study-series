package com.playanetworks.springmvc;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.playanetworks.springmvc.DAO.MemberDAO;
import com.playanetworks.springmvc.VO.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/*.xml"})
public class MemberDAOTest {
	@Inject
	private MemberDAO dao;
	
	@Test
	public void testTime() throws Exception {
		System.out.println("현재 시간" + dao.getTime());
	}
	
	@Test
	public void testInsertMember() throws Exception {
		MemberVO vo = new MemberVO();
		vo.setUserId("nodle");
		vo.setUserPw("1234");
		vo.setUserName("강노들");
		vo.setEmail("mgchoo@mail.com");
		dao.insertMember(vo);
	}
}
