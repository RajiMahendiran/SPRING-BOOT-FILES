package com.project.springboot.service;
import java.util.List;

import com.project.springboot.model.Product;

public interface ProductService {
	
	
	List<Product> getAll();
	Product findById(int id);
	Product findByName(String name);

}
