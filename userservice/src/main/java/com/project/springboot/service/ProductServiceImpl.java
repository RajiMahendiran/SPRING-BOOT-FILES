package com.project.springboot.service;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.project.springboot.model.Product;
import com.project.springboot.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductRepository productRepository;

	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	
	@Override
	public List<Product> getAll() {

		return (List<Product>) productRepository.findAll();

	}

	@Override
	public Product findById(int id) {

		Product p = productRepository.findById(id).orElse(null);

		return p;

	}

	@Override
	public Product findByName(String name) {
		
		return productRepository.getByName(name);
		
		
	}

}
