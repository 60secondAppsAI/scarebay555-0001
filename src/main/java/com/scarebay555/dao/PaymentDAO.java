package com.scarebay555.dao;

import java.util.List;

import com.scarebay555.dao.GenericDAO;
import com.scarebay555.domain.Payment;





public interface PaymentDAO extends GenericDAO<Payment, Integer> {
  
	List<Payment> findAll();
	






}


