package com.nhce.springmvcthymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhce.springmvcthymeleaf.entity.Staff;

public interface StaffRepo extends JpaRepository<Staff, Integer> {

}