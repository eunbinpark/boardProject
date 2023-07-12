package bitedu.bipa.book.service;

<<<<<<< HEAD
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bitedu.bipa.book.dao.BoarderDAO;
import bitedu.bipa.book.vo.PosterVO;

@Service("boardService")
public class BoarderService {
	
	@Autowired
	private BoarderDAO dao;
	
	public ArrayList<PosterVO> searchBoardAll(){
		ArrayList<PosterVO> board = null;
		board = dao.selectBoardAll();
		return board;
	}
	
//	public ArrayList<PosterVO> searchBoard(String title){
//		ArrayList<PosterVO> board = null;
//		board = dao.searchBoard(title);
//		return board;
//	}
//	
//	public boolean registBook(PosterVO poster) {
//       boolean flag = false;
//       flag = dao.poster_regist(poster);
//       return flag;
//    }
=======
public class BoarderService {
>>>>>>> 05766f665c9df7ebad5708741a3f73052b1cbe3d

}
