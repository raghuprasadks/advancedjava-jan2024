package com.nhce.springmvcthymeleaf.service;

import java.util.List;

import com.nhce.springmvcthymeleaf.entity.Staff;

public interface StaffService {
	void save(Staff staff);

	List<Staff> getAll();

	Staff getById(Integer id);

	void delete(Staff staff);
}
