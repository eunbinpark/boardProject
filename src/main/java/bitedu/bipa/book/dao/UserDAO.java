package bitedu.bipa.book.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bitedu.bipa.book.vo.UserVO;

@Repository
public class UserDAO {
	
	@Autowired
	private UserVO find_user;
	
	@Autowired
	private UserVO flag_user;
	
	   @Autowired
	   SqlSession sqlSession;
	   
	   public UserVO get_loginUser(String ID, String PW) {
		   flag_user.setUser_id(ID);
		   flag_user.setUser_pw(PW);
		   find_user = sqlSession.selectOne("mapper.user.selectLoginUser",flag_user);
		   System.out.println("1111");
	      System.out.println(find_user.getUser_id());
	      return find_user;
	   }
	

}
