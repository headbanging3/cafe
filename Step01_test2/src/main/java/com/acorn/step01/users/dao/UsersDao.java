package com.acorn.step01.users.dao;

import java.util.List;

import com.acorn.step01.users.dto.UsersDto;

public interface UsersDao {
	public void insert(UsersDto dto);
	public void delete(String id);
	public void update(UsersDto dto);
	public UsersDto getData(int num);
	public List<UsersDto> getList();
	public boolean isValid(UsersDto dto);
	public boolean canUseId(String id);
}
