package com.scarebay555.dao;

import java.util.List;

import com.scarebay555.dao.GenericDAO;
import com.scarebay555.domain.User;

import java.util.Optional;




public interface UserDAO extends GenericDAO<User, Integer> {
  
	List<User> findAll();
	






}


