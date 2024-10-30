package com.scarebay555.dao;

import java.util.List;

import com.scarebay555.dao.GenericDAO;
import com.scarebay555.domain.Feedback;





public interface FeedbackDAO extends GenericDAO<Feedback, Integer> {
  
	List<Feedback> findAll();
	






}


