package com.scarebay555.dao;

import java.util.List;

import com.scarebay555.dao.GenericDAO;
import com.scarebay555.domain.Category;





public interface CategoryDAO extends GenericDAO<Category, Integer> {
  
	List<Category> findAll();
	






}


