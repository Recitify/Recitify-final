package com.racaron.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.racaron.entity.Community;

@Repository
public interface CommunityDAO extends JpaRepository<Community, Integer>{

}
