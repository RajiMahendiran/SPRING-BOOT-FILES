package com.project.springboot.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.project.springboot.model.Category;
import com.project.springboot.repository.CategoryRepository;
@Service
public class CategoryServiceImpl implements CategoryService{

	
	private CategoryRepository categoryRepository;
	
	public CategoryServiceImpl(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	public List<Category> getAll() {
		return (List<Category>) categoryRepository.findAll();
	}

	@Override
	public Category findById(int id) {
		
		return categoryRepository.findById(id).orElse(null);
		
	}

}
