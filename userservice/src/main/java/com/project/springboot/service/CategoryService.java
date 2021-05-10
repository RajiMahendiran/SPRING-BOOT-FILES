package com.project.springboot.service;

import java.util.List;

import com.project.springboot.model.Category;

public interface CategoryService {

	List<Category> getAll();
	Category findById(int id);
	
}

