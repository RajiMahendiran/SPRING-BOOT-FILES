package com.project.springboot.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.springboot.model.Category;
@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer>{

}
