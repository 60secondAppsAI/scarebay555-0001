package com.scarebay555.dao;

import java.util.List;

import com.scarebay555.dao.GenericDAO;
import com.scarebay555.domain.Watchlist;





public interface WatchlistDAO extends GenericDAO<Watchlist, Integer> {
  
	List<Watchlist> findAll();
	






}


