package bitedu.bipa.book.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bitedu.bipa.book.vo.UserVO;

@Repository
public class UserDAO {
	
	private UserVO find_user;
	   private Connection con = null;
	   private PreparedStatement pstmt = null;
	   
	   @Autowired
	   DataSource dataSource;
	   
	   public UserVO get_loginUser(String ID, String PW) {
	      
	      try {
	         con = dataSource.getConnection();
	         String sql = new StringBuilder().append("SELECT * ")
	                                 .append("FROM user")
	                                 .append("WHERE user_id = ? and user_pw = ?").toString();
	         pstmt = con.prepareStatement(sql);
	         pstmt.setString(1, ID);
	         pstmt.setString(2, PW);
	         ResultSet rs = pstmt.executeQuery();
	         if(rs.next()) {
	            find_user.setUser_id(rs.getNString("user_id"));
	            find_user.setUser_name(rs.getString("user_pw"));
	            find_user.setUser_name(rs.getString("user_name"));
	            find_user.setUser_pk(rs.getInt("user_pk"));
	         }
	      }catch(SQLException e) {
	         e.printStackTrace();
	      }
	      return find_user;
	   }
	

}
