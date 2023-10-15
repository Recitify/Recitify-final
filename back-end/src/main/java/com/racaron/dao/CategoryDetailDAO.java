package com.racaron.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.racaron.entity.CategoriesDetails;

@Repository
public interface CategoryDetailDAO extends JpaRepository<CategoriesDetails, Integer>{

}
