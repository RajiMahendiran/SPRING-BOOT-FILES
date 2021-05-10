package com.project.springboot.controller;

import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.springboot.model.Category;
import com.project.springboot.service.CategoryService;

@Controller
public class CategoryController {

	private CategoryService categoryService;

	public CategoryController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
	@RequestMapping("/categories")
	public String findCategories(Model model){
		
		List<Category> categories = categoryService.getAll();
		
		model.addAttribute("categories",categories);
		
		return "category-list";
		
	}
	@RequestMapping("/category/{id}")
	public String getCategoryInfo(@PathVariable int id,Model model){
		
		Category category = categoryService.findById(id);
		
		model.addAttribute("category",category);
		
		return "category-info";
		
		
		
	}
	
}
