package com.acorn.step01.users.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

import com.acorn.step01.users.dto.UsersDto;

public interface UsersService {
	public void insert(HttpServletRequest request, UsersDto dto);
	public void delete(HttpServletRequest request, String id);
	public void update(HttpServletRequest request, UsersDto dto);
	public ModelAndView list();
	public ModelAndView getData(int num);
	public ModelAndView isValid(UsersDto dto);
	public ModelAndView canUseId(String id);
}
