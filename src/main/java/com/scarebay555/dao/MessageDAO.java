package com.scarebay555.dao;

import java.util.List;

import com.scarebay555.dao.GenericDAO;
import com.scarebay555.domain.Message;





public interface MessageDAO extends GenericDAO<Message, Integer> {
  
	List<Message> findAll();
	






}


