package bitedu.bipa.book.vo;


import java.sql.Timestamp;

public class PosterVO {
	private int poster_pk;
	private String title;
	private String author;
	private String contents;
	
	private Timestamp writer_date;
	private Timestamp update_date;
	private int view_num;
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public int getPoster_pk() {
		return poster_pk;
	}
	public void setPoster_pk(int poster_pk) {
		this.poster_pk = poster_pk;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Timestamp getWriter_date() {
		return writer_date;
	}
	public void setWriter_date(Timestamp writer_date) {
		this.writer_date = writer_date;
	}
	public Timestamp getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(Timestamp update_date) {
		this.update_date = update_date;
	}
	public int getView_num() {
		return view_num;
	}
	public void setView_num(int view_num) {
		this.view_num = view_num;
	}
	@Override
	public String toString() {
		return "PosterVO [poster_pk=" + poster_pk + ", title=" + title + ", author=" + author + ", writer_date="
				+ writer_date + ", update_date=" + update_date + ", view_num=" + view_num + "]";
	}
	
}
