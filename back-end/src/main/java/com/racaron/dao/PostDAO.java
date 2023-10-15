package com.racaron.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.racaron.entity.Post;

@Repository
public interface PostDAO extends JpaRepository<Post, Integer> {

}
