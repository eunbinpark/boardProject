package bitedu.bipa.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bitedu.bipa.book.dao.UserDAO;
import bitedu.bipa.book.vo.UserVO;

@Service
public class UserService {

	@Autowired
	UserVO user;
	
	@Autowired
	UserDAO userdao;
	   
	public UserVO get_loginUser(String ID, String PW) {
	      
		return userdao.get_loginUser(ID, PW);      
	 }
	
}
