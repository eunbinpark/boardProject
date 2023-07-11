package bitedu.bipa.book.vo;

public class ScrapVO {
	private int scrap_pk;
	private int poster_pk;
	private int user_pk;
	public int getScrap_pk() {
		return scrap_pk;
	}
	public void setScrap_pk(int scrap_pk) {
		this.scrap_pk = scrap_pk;
	}
	public int getPoster_pk() {
		return poster_pk;
	}
	public void setPoster_pk(int poster_pk) {
		this.poster_pk = poster_pk;
	}
	public int getUser_pk() {
		return user_pk;
	}
	public void setUser_pk(int user_pk) {
		this.user_pk = user_pk;
	}
	@Override
	public String toString() {
		return "ScrapVO [scrap_pk=" + scrap_pk + ", poster_pk=" + poster_pk + ", user_pk=" + user_pk + "]";
	}
	
}
