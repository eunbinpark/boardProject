package bitedu.bipa.book.vo;

public class PosterLikeVO {
	private int like_pk;
	private int user_pk;
	private int poster_pk;
	private boolean like_YN;
	public int getLike_pk() {
		return like_pk;
	}
	public void setLike_pk(int like_pk) {
		this.like_pk = like_pk;
	}
	public int getUser_pk() {
		return user_pk;
	}
	public void setUser_pk(int user_pk) {
		this.user_pk = user_pk;
	}
	public int getPoster_pk() {
		return poster_pk;
	}
	public void setPoster_pk(int poster_pk) {
		this.poster_pk = poster_pk;
	}
	public boolean isLike_YN() {
		return like_YN;
	}
	public void setLike_YN(boolean like_YN) {
		this.like_YN = like_YN;
	}
	@Override
	public String toString() {
		return "PosterLikeVO [like_pk=" + like_pk + ", user_pk=" + user_pk + ", poster_pk=" + poster_pk + ", like_YN="
				+ like_YN + "]";
	}
}
