package com.acorn.step01;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public ModelAndView home() {
		List<String> list = new ArrayList<>();
		list.add("공지사항입니다.");
		list.add("어쩌구..");
		ModelAndView mView = new ModelAndView();
		mView.addObject("list", list);
		mView.setViewName("home");
		return mView;
	}
	
}