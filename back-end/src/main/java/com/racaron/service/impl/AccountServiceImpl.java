package com.racaron.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.racaron.dao.AccountDAO;
import com.racaron.entity.Account;
import com.racaron.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{

	
	@Autowired
	AccountDAO accountDAO;
	
	@Override
	public List<Account> lstAccount() {
		// TODO Auto-generated method stub
		return accountDAO.findAll();
	}

}
