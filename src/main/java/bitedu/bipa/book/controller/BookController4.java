package bitedu.bipa.book.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import bitedu.bipa.book.service.BlmService2;
import bitedu.bipa.book.vo.BookCopy;

@Controller("bookController4")
@RequestMapping("springdb")
public class BookController4 {
	
	@Autowired
	private BlmService2 blmService;

	@RequestMapping(value="/list1.do", method=RequestMethod.GET)
	public ModelAndView list(@RequestParam("pagesize") String pagesize,@RequestParam("currentpage") String currentpage) {
		System.out.println("springdb");
		ModelAndView mav = new ModelAndView();
		ArrayList<BookCopy> list = blmService.searchBookAll();
		
		if(pagesize==null||currentpage==null) {
			mav.addObject("list",blmService.getpagingList(list, 9, 1));
		}else {
			mav.addObject("list",blmService.getpagingList(list, Integer.parseInt(pagesize), Integer.parseInt(currentpage)));
		}
		
		int pagingsize = blmService.getpagingsize();
		
		mav.addObject("pagingsize", pagingsize);
		mav.setViewName("./manager/book_list");
		return mav;
	}
	@RequestMapping(value="/list.do", method=RequestMethod.GET)
	public ModelAndView list() {
		System.out.println("springdb");
		ModelAndView mav = new ModelAndView();
		ArrayList<BookCopy> list = blmService.searchBookAll();
		String pagesize = "9";
		String currentpage= "1";
		if(pagesize==null||currentpage==null) {
			mav.addObject("list",blmService.getpagingList(list, 9, 1));
		}else {
			mav.addObject("list",blmService.getpagingList(list, Integer.parseInt(pagesize), Integer.parseInt(currentpage)));
		}
		
		int pagingsize = blmService.getpagingsize();
		
		mav.addObject("pagingsize", pagingsize);
		mav.setViewName("./manager/book_list");
		return mav;
	}
	
	@RequestMapping(value="/view_regist.do", method=RequestMethod.GET)
	public ModelAndView viewRegist() {
		ModelAndView mav = new ModelAndView();
		
		
		mav.setViewName("./manager/book_regist");
		return mav;
	}
	
	@RequestMapping(value="/view_detail.do", method=RequestMethod.GET)
	public ModelAndView viewDetail(@RequestParam("bookSeq") String bookSeq) {
		ModelAndView mav = new ModelAndView();
		BookCopy copy = blmService.findBook(bookSeq);
		mav.addObject("copy",copy);
		mav.setViewName("./manager/book_detail");
		return mav;
	}
	
	@RequestMapping(value="/view_update.do", method=RequestMethod.POST)
	public ModelAndView viewUpdate(@RequestParam("bookSeq") String bookSeq) {
		ModelAndView mav = new ModelAndView();
		BookCopy copy = blmService.findBook(bookSeq);
		mav.addObject("copy",copy);
		mav.setViewName("./manager/book_update");
		return mav;
	}
	
	@RequestMapping(value="/remove.do", method=RequestMethod.GET)
	public ModelAndView remove(@RequestParam("bookSeq") String bookSeq) {
		ModelAndView mav = new ModelAndView();
		boolean flag = blmService.removeBook(bookSeq);
		
		mav.setViewName("redirect:list.do");
		return mav;
	}
	
	@RequestMapping(value="/update.do", method=RequestMethod.POST)
	public ModelAndView update(@ModelAttribute("book") BookCopy copy) {
		ModelAndView mav = new ModelAndView();
		
//		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//		try {
//			Date now = df.parse(date);
//			copy.setPublishDate(new Timestamp(now.getTime()));
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		boolean flag = blmService.modifyBook(copy);
		System.out.println("regist");
		mav.setViewName("redirect:list.do");
		return mav;
	}
	
	@RequestMapping(value="/regist.do", method=RequestMethod.POST)
	public ModelAndView regist(@ModelAttribute("book") BookCopy copy) {
		ModelAndView mav = new ModelAndView();
		System.out.println(copy);
		blmService.registBook(copy);
		System.out.println("regist");
		mav.setViewName("redirect:list.do");
		return mav;
	}
	
	
	
	
}
