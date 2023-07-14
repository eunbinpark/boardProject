package bitedu.bipa.book.service;


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
	public void registposter(PosterVO poster) {
       dao.poster_regist(poster);
    }
	public boolean updateposter(PosterVO poster) {
		return dao.poster_update(poster);
	}


}
