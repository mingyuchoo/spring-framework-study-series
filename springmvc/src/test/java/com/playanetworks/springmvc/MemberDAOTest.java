package com.playanetworks.springmvc;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.playanetworks.springmvc.dao.MemberDAO;
import com.playanetworks.springmvc.vo.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class MemberDAOTest {
	@Inject
	private MemberDAO dao;
	
	@Test
	public void testTime() throws Exception {
		System.out.println("Current Time: " + dao.getTime());
	}
	
//	@Test
//	public void testInsertMember() throws Exception {
//		MemberVO member = new MemberVO();
//		member.setUserId("nodle");
//		member.setUserPw("1234");
//		member.setUserName("Nodle");
//		member.setEmail("mgchoo@mail.com");
//		dao.insertMember(member);
//	}
	
	@Test
	public void testReadMember() throws Exception {
	    MemberVO member = dao.readMember("nodle");
	    System.out.println("Member Id: " + member.getUserId());
	}
}
