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
	
	
	// 由ъ뒪�듃
	@RequestMapping(value="/list.do", method=RequestMethod.GET)
	public ModelAndView list() {
		System.out.println("list");
		ModelAndView mav = new ModelAndView();
		ArrayList<PosterVO> list = boardService.searchBoardAll();
		mav.addObject("list",list);
		mav.addObject("loginuser", loginUser);
		mav.setViewName("./manager/board_list");
		return mav;
	}
	@RequestMapping(value="view_regist.do", method=RequestMethod.GET)
	public ModelAndView view_regist() {
		System.out.println("view_regist");
		ModelAndView mav = new ModelAndView();
		mav.addObject("login_user",loginUser);
		mav.setViewName("./manager/poster_regist");
		return mav;
	}
	@RequestMapping(value="regist.do", method=RequestMethod.GET)
	public ModelAndView regist(@ModelAttribute("poster") PosterVO poster) {
		System.out.println("regist");
		System.out.println(poster.getAuthor());
		ModelAndView mav = new ModelAndView();
		boardService.registposter(poster);
		
		mav.setViewName("redirect:list.do");
		return mav;
	}
	@RequestMapping(value="/view_login.do", method=RequestMethod.GET)
	public ModelAndView view_login_User() {
	   ModelAndView mav = new ModelAndView();
	   
	   mav.setViewName("./manager/login");
	   return mav;
	}
	
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public ModelAndView login_User(@RequestParam("user_id") String ID, @RequestParam("user_pw") String pw) {
	ModelAndView mav = new ModelAndView();
	System.out.println(ID);
	System.out.println(pw);
	loginUser = userService.get_loginUser(ID, pw);
	  
	if(loginUser == null) {
	   System.out.println("濡쒓렇�씤 �떎�뙣");
	   mav.setViewName("./manager/login");
	}else {
	   System.out.println("濡쒓렇�씤 �꽦怨�");
	   mav.setViewName("redirect:list.do");
	    }
	    return mav;
	}
	@RequestMapping(value="/view_update.do", method=RequestMethod.GET)
	public ModelAndView view_update(@RequestParam("poster_pk") String poster_pk) {
		System.out.println(poster_pk);
		System.out.println("view_update");
		ModelAndView mav = new ModelAndView();
		PosterVO poster = boardService.selectPoster(Integer.parseInt(poster_pk));
		System.out.println(poster_pk);
		mav.addObject("poster",poster);
		mav.setViewName("./manager/poster_update");
		return mav;
	}
	@RequestMapping(value="/update.do", method=RequestMethod.GET)
	public ModelAndView update(@ModelAttribute("update") PosterVO poster) {
		ModelAndView mav = new ModelAndView();
		System.out.println("update");
		if(boardService.updateposter(poster)) {
			System.out.println("�꽦怨�");
		}else {
			System.out.println("�떎�뙣");
		}
		
		mav.setViewName("redirect:list.do");
		return mav;
	}
	@RequestMapping(value="/view_detail.do", method=RequestMethod.GET)
	public ModelAndView view_detail(@RequestParam("posterPk") String poster_pk) {
		ModelAndView mav = new ModelAndView();
		int poster_pk_int = Integer.parseInt(poster_pk);
		System.out.println(poster_pk_int);
		PosterVO selectPoster = boardService.selectPoster(poster_pk_int);
		mav.addObject("loginuser", loginUser);
		if(boardService.PlusViewNum(poster_pk_int)) {
			mav.addObject("select_poster", selectPoster);
		}
		if(selectPoster.getAuthor().equals(loginUser.getUser_id())) {
			
			mav.addObject("flag", "true");
		}
		mav.setViewName("./manager/poster_detail");
		
		return mav;
	}
	
	
}
