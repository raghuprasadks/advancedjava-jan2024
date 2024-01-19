package com.nhce.springbootcrud.service;

import java.util.List;

import com.nhce.springbootcrud.entity.User;

public interface UserService {	
	public void save(User user);
	public List<User> getUser();
	public User findById(Integer id);
	public void Delete(Integer id);
}
