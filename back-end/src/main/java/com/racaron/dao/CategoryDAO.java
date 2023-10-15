package com.racaron.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.racaron.entity.Categories;

@Repository
public interface CategoryDAO extends JpaRepository<Categories, Integer>{

}
