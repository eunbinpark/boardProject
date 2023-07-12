package bitedu.bipa.book.controller;

<<<<<<< HEAD
import java.util.ArrayList;
=======
import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
>>>>>>> 05766f665c9df7ebad5708741a3f73052b1cbe3d

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import bitedu.bipa.book.service.BoarderService;
import bitedu.bipa.book.service.UserService;
import bitedu.bipa.book.vo.PosterVO;
import bitedu.bipa.book.vo.UserVO;
@Controller("boarderController")
//@RequestMapping("springdb")
public class BoarderController {
	
	private UserVO loginUser = null;
	
	   
//	@Autowired
//	UserService userService;
	
	@Autowired
	private BoarderService boardService;
	
	// 리스트
	@RequestMapping(value="/list.do", method=RequestMethod.GET)
	public ModelAndView list() {
		System.out.println("extends");
		ModelAndView mav = new ModelAndView();
		ArrayList<PosterVO> list = boardService.searchBoardAll();
		mav.addObject("list",list);
		mav.setViewName("./manager/board_list");
		return mav;
	}
//	// 제목 검색 후 List
//	@RequestMapping(value="/search.do", method=RequestMethod.GET)
//	public ModelAndView search(@RequestParam("title") String title) {
//		System.out.println("extends");
//		ModelAndView mav = new ModelAndView();
//		ArrayList<PosterVO> list = boardService.searchBoard(title);
//		mav.addObject("list",list);
//		mav.setViewName("./manager/board_search");
//		return mav;
//	}
//	
//	   
//	
//	   
//	   @RequestMapping(value="/view_login.do", method=RequestMethod.POST)
//	   public ModelAndView view_login_User() {
//	      ModelAndView mav = new ModelAndView();
//	      
//	      
//	      //mav.setViewName("./manager/login");
//	      return mav;
//	   }
//	   
//	   @RequestMapping(value="/login.do", method=RequestMethod.POST)
//	   public ModelAndView login_User(@RequestParam("user_id") String ID, @RequestParam("user_pw") String pw) {
//	      ModelAndView mav = new ModelAndView();
//	      loginUser = userService.get_loginUser(ID, pw);
//	      
//	      if(loginUser == null) {
//	         System.out.println("로그인 실패");
//	         //mav.setViewName("./manager/login");
//	      }else {
//	         System.out.println("로그인 성공");
//	         mav.setViewName("./manager/border_list");
//	      }
//	      return mav;
//	   }
//
//	
=======
import org.springframework.web.servlet.ModelAndView;

import bitedu.bipa.book.service.QuizService;
import bitedu.bipa.book.vo.BookCopy;

@Controller("BorderController")
@RequestMapping("/boarder")
public class BoarderController {
	
	@Autowired
	private QuizService quizService;

	@RequestMapping(value="/list.do", method=RequestMethod.GET)
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		//ArrayList<BookCopy> list = quizService.searchBookAll();
		//mav.addObject("list",list);
		mav.setViewName("./manager/border_list");
		return mav;
	}
	
	@RequestMapping(value="/view_regist.do", method=RequestMethod.GET)
	public ModelAndView viewRegist() {
		ModelAndView mav = new ModelAndView();
		
		
		mav.setViewName("./manager/book_regist");
		return mav;
	}
	
	@RequestMapping(value="/view_detail.do", method=RequestMethod.GET)
	public ModelAndView viewDetail(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		String bookSeq = request.getParameter("bookSeq");
		BookCopy copy = quizService.findBook(bookSeq);
		mav.addObject("copy",copy);
		mav.setViewName("./manager/book_detail");
		return mav;
	}
	
	@RequestMapping(value="/view_update.do", method=RequestMethod.POST)
	public ModelAndView viewUpdate(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		String bookSeq = request.getParameter("bookSeq");
		BookCopy copy = quizService.findBook(bookSeq);
		mav.addObject("copy",copy);
		mav.setViewName("./manager/book_update");
		return mav;
	}
	
	@RequestMapping(value="/remove.do", method=RequestMethod.GET)
	public ModelAndView remove(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		String bookSeq = request.getParameter("bookSeq");
		boolean flag = quizService.removeBook(bookSeq);
		
		mav.setViewName("redirect:list.do");
		return mav;
	}
	
	@RequestMapping(value="/update.do", method=RequestMethod.POST)
	public ModelAndView update(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		BookCopy copy = new BookCopy();
		copy.setBookSeq(Integer.parseInt(request.getParameter("book_seq")));
		copy.setIsbn(request.getParameter("isbn"));
		copy.setTitle(request.getParameter("book_title"));
		copy.setAuthor(request.getParameter("author"));
		String date = request.getParameter("publish_date");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date now = df.parse(date);
			copy.setPublishDate(new Timestamp(now.getTime()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean flag = quizService.modifyBook(copy);
		System.out.println("regist");
		mav.setViewName("redirect:list.do");
		return mav;
	}
	
	@RequestMapping(value="/regist.do", method=RequestMethod.POST)
	public ModelAndView regist(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		BookCopy copy = new BookCopy();
		copy.setIsbn(request.getParameter("isbn"));
		copy.setTitle(request.getParameter("book_title"));
		copy.setAuthor(request.getParameter("author"));
		copy.setPublisher(request.getParameter("publisher"));
		String date = request.getParameter("publish_date");
		System.out.println(date);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date now = df.parse(date);
			copy.setPublishDate(new Timestamp(now.getTime()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		quizService.registBook(copy);
		System.out.println("regist");
		mav.setViewName("redirect:list.do");
		return mav;
	}
	
	
>>>>>>> 05766f665c9df7ebad5708741a3f73052b1cbe3d
	
	
}
