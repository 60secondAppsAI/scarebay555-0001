package com.scarebay555.dao;

import java.util.List;

import com.scarebay555.dao.GenericDAO;
import com.scarebay555.domain.Bid;





public interface BidDAO extends GenericDAO<Bid, Integer> {
  
	List<Bid> findAll();
	






}


