package com.nhce.springbootcrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhce.springbootcrud.entity.User;

public interface UserRespository extends JpaRepository<User,Integer>{

}
