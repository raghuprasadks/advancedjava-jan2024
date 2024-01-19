package com.nhce.springbootcrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhce.springbootcrud.dao.UserRepository;
import com.nhce.springbootcrud.entity.User;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepo;
	@Override
	public void save(User user) {
		userRepo.save(user);		
	}
	@Override
	public List<User> getUser() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}
	@Override
	public User findById(Integer id) {
		Optional<User> userResult = userRepo.findById(id);
		User user = null;
		if (userResult.isPresent()) {
			user = userResult.get();
		} 
		return user;
	}
	@Override
	public void Delete(Integer id) {
		// TODO Auto-generated method stub
		userRepo.deleteById(id);		
	}
}
