package com.acorn.step01.users.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.acorn.step01.users.dto.UsersDto;


@Service
public class UsersServiceImpl implements UsersService{

	@Override
	public void insert(HttpServletRequest request, UsersDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(HttpServletRequest request, String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(HttpServletRequest request, UsersDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ModelAndView list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView getData(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView isValid(UsersDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView canUseId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
