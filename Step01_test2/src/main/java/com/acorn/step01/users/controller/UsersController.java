package com.acorn.step01.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.acorn.step01.users.service.UsersService;

@Controller
public class UsersController {
	// 의존 객체
	@Autowired
	private UsersService usersService;
	
	@RequestMapping("/users/loginform")
	public ModelAndView loginform() {
		
		ModelAndView mView = new ModelAndView();
		mView.setViewName("users/loginform");
		return mView;
		
	}
	
	@RequestMapping("/users/joinform")
	public String joinform() {
		return "users/joinform";
	}
}
