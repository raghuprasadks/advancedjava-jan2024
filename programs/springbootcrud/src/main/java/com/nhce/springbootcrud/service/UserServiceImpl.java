package com.nhce.springbootcrud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nhce.springbootcrud.dao.UserRepository;
import com.nhce.springbootcrud.entity.User;

@Service
public class UserServiceImpl implements UserService{

	private UserRepository userRepo;
	
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
