package bitedu.bipa.book.vo;

import java.sql.Timestamp;

public class BoardVO {
   private int posterPk;
   private String title;
   private String author;
   private Timestamp write_date;
   private Timestamp update_date;
   private int viewNum;
   
   public int getPosterPk() {
      return posterPk;
   }
   public void setPosterPk(int posterPk) {
      this.posterPk = posterPk;
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
   public Timestamp getWrite_date() {
      return write_date;
   }
   public void setWrite_date(Timestamp write_date) {
      this.write_date = write_date;
   }
   public Timestamp getUpdate_date() {
      return update_date;
   }
   public void setUpdate_date(Timestamp update_date) {
      this.update_date = update_date;
   }
   public int getViewNum() {
      return viewNum;
   }
   public void setViewNum(int viewNum) {
      this.viewNum = viewNum;
   }
   
   
   
}