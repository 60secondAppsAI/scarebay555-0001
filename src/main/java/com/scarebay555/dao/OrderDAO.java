package com.scarebay555.dao;

import java.util.List;

import com.scarebay555.dao.GenericDAO;
import com.scarebay555.domain.Order;





public interface OrderDAO extends GenericDAO<Order, Integer> {
  
	List<Order> findAll();
	






}


