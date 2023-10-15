package com.racaron.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.racaron.entity.Account;

@Repository
public interface AccountDAO extends JpaRepository<Account, Integer>{

}
