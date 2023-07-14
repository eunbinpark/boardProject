package bitedu.bipa.book.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bitedu.bipa.book.vo.PosterVO;

@Repository("boardDAO")
public class BoarderDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	public ArrayList<PosterVO> selectBoardAll(){
		ArrayList<PosterVO> poster = (ArrayList)sqlSession.selectList("mapper.poster.selectAllPoster");
		return poster;
	}
	
//	public ArrayList<PosterVO> searchBoard(String title){
//		ArrayList<PosterVO> board = new ArrayList<PosterVO>();
//		PosterVO vo = null;
//		String sql = new StringBuilder().append("select * ")
//				.append("from poster ")
//				.append("where title like '%?%'")
//				.toString();
//		Connection con = null;
//		PreparedStatement pstmt = null;
//		try {
//			con=dataSource.getConnection();
//			pstmt = con.prepareStatement(sql);
//			pstmt.setString(1, title);
//			ResultSet rs = pstmt.executeQuery();
//			
//			while(rs.next()) {
//				vo = new PosterVO();
//				vo.setPoster_pk(rs.getInt(1));
//				vo.setTitle(rs.getString(2));
//				vo.setAuthor(rs.getString(3));
//				vo.setWriter_date(rs.getTimestamp(4));
//				vo.setUpdate_date(rs.getTimestamp(5));
//				vo.setView_num(rs.getInt(6));
//				board.add(vo);
//			}
//			con.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		return board;
//	}	   
//	   
//	   
	public void poster_regist(PosterVO poster) {
      sqlSession.insert("mapper.poster.registPoster", poster);
   }
	public boolean poster_update(PosterVO poster) {
		boolean flag = false;
		System.out.println("title:" + poster.getTitle()+ " author: "+poster.getAuthor()+ " contents: " +poster.getContents());
		System.out.println(poster.getPoster_pk());
		if(sqlSession.update("mapper.poster.update_poster",poster)>0) {
			flag = true;
		}
		return flag;
	}
	public PosterVO selectPosterVO(int posterpk) {
		return sqlSession.selectOne("mapper.poster.selectPoster", posterpk);
	}

}
