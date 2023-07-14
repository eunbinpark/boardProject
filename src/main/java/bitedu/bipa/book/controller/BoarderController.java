package bitedu.bipa.book.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
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

	private UserVO loginUser;	
	private BoarderService boardService;
	private UserService userService;
	@Autowired
	public BoarderController(UserVO loginUser, BoarderService boardService, UserService userService) {
		this.loginUser = loginUser;
		this.boardService = boardService;
		this.userService = userService;
	}
	
	
	// 리스트
	@RequestMapping(value="/list.do", method=RequestMethod.GET)
	public ModelAndView list() {
		System.out.println("list");
		ModelAndView mav = new ModelAndView();
		ArrayList<PosterVO> list = boardService.searchBoardAll();
		mav.addObject("list",list);
		mav.setViewName("./manager/board_list");
		return mav;
	}
	@RequestMapping(value="view_regist.do", method=RequestMethod.GET)
	public ModelAndView view_regist() {
		System.out.println("view_regist");
		ModelAndView mav = new ModelAndView();
		loginUser.setUser_id("user1");
		loginUser.setUser_pw("user1");
		loginUser.setUser_name("qwe");
		mav.addObject("login_user",loginUser);
		mav.setViewName("./manager/poster_regist");
		return mav;
	}
	@RequestMapping(value="regist.do", method=RequestMethod.POST)
	public ModelAndView regist(@ModelAttribute("poster") PosterVO poster) {
		System.out.println("regist");
		System.out.println(poster.getAuthor());
		ModelAndView mav = new ModelAndView();
		boardService.registposter(poster);
		
		mav.setViewName("redirect:list.do");
		return mav;
	}
	@RequestMapping(value="/view_login.do", method=RequestMethod.POST)
	public ModelAndView view_login_User() {
	   ModelAndView mav = new ModelAndView();
	   
	   mav.setViewName("./manager/login");
	   return mav;
	}
	
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public ModelAndView login_User(@RequestParam("user_id") String ID, @RequestParam("user_pw") String pw) {
	ModelAndView mav = new ModelAndView();
	UserService userService = new UserService();
	loginUser = userService.get_loginUser(ID, pw);
	  
	if(loginUser == null) {
	   System.out.println("로그인 실패");
	   mav.setViewName("./manager/login");
	}else {
	   System.out.println("로그인 성공");
	   mav.setViewName("./manager/border_list");
	    }
	    return mav;
	}
	@RequestMapping(value="/view_update.do", method=RequestMethod.GET)
	public ModelAndView view_update(@ModelAttribute("poster") PosterVO poster) {
		System.out.println("view_update");
		ModelAndView mav = new ModelAndView();
		mav.addObject("poster",poster);
		mav.setViewName("./manager/poster_update");
		return mav;
	}
	@RequestMapping(value="/update.do", method=RequestMethod.POST)
	public ModelAndView update(@ModelAttribute("update") PosterVO poster) {
		ModelAndView mav = new ModelAndView();
		System.out.println("update");
		if(boardService.updateposter(poster)) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
		mav.setViewName("redirect:list.do");
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
	   
//	   
	   
//	
	
	
}
