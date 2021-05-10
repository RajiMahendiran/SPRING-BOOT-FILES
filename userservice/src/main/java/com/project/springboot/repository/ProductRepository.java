package com.project.springboot.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.project.springboot.model.Product;

@Component
public interface ProductRepository extends CrudRepository<Product, Integer>{

	Product getByName(String name);
	
}