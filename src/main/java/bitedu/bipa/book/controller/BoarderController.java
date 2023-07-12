package bitedu.bipa.book.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	
}
