package com.scarebay555.dao;

import java.util.List;

import com.scarebay555.dao.GenericDAO;
import com.scarebay555.domain.Item;





public interface ItemDAO extends GenericDAO<Item, Integer> {
  
	List<Item> findAll();
	






}


