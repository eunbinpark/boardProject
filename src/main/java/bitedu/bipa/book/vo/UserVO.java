package bitedu.bipa.book.vo;

import org.springframework.stereotype.Component;

@Component
public class UserVO {
	private int user_pk;
	private String user_id;
	private String user_pw;
	private String user_name;
	
	public UserVO() {
		
	}
	public UserVO(String id, String pw) {
		user_id = id;
		user_pw = pw;
	}
	public UserVO(String id, String pw, String name) {
		this(id,pw);
		user_name=name;
	}
	
	public int getUser_pk() {
		return user_pk;
	}
	public void setUser_pk(int user_pk) {
		this.user_pk = user_pk;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	@Override
	public String toString() {
		return "UserVO [user_pk=" + user_pk + ", user_id=" + user_id + ", user_pw=" + user_pw + ", user_name="
				+ user_name + "]";
	}
}
