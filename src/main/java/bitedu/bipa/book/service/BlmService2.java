package bitedu.bipa.book.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bitedu.bipa.book.dao.BlmDAO2;
import bitedu.bipa.book.vo.BoardVO;

@Service("blmService2")
public class BlmService2 {
	
	@Autowired
	private BlmDAO2 dao;
	private int totalPage;
	private boolean hasPreviousPageNav;	// 이전페이지 
	private boolean hasNextPageNav;		// 다음페이지
	private boolean hasFirstPageNav;	// 맨 첫번째 페이지
	private boolean hasLastPageNav;		// 맨 마지막 페이지
	
	public int getpagingsize() {
		return totalPage;
	}

//	public boolean registBook(BoardVO bvo) {
//		boolean flag = false;
//		flag = dao.insertBook(bvo);
//		return flag;
//	}
	
	public ArrayList<BoardVO> searchBookAll(){
		ArrayList<BoardVO> list = null;
		list = dao.selectBookAll();
		return list;
	}
	
	public ArrayList<BoardVO> getpagingList(ArrayList<BoardVO> AllList, int pagesize, int currentpage){
		ArrayList<BoardVO> getlist = new ArrayList<BoardVO>();
		int allListsize = AllList.size();
		totalPage = ((allListsize-1)/pagesize)+1;
		
		for(int i=(currentpage-1)*pagesize; i<currentpage*pagesize; i++) {
			if(allListsize>i){
				getlist.add(AllList.get(i));
			}else {
				break;
			}
			
		}
		
		return getlist;
	}
	public boolean removeBook(String bookSeq) {
		// TODO Auto-generated method stub
		boolean flag = false;
		flag = dao.deleteBook(Integer.parseInt(bookSeq));
		return flag;
	}
//	public BookCopy findBook(String bookSeq) {
//		BookCopy copy = null;
//		copy = dao.selectBook(Integer.parseInt(bookSeq));
//		System.out.println(copy);
//		return copy;
//	}
//	public boolean modifyBook(BookCopy copy) {
//		// TODO Auto-generated method stub
//		boolean flag = false;
//		flag = dao.updateBook(copy);
//		return flag;
//	}
}







