package com.racaron.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.racaron.entity.Profile;

@Repository
public interface ProfileDAO extends JpaRepository<Profile, Integer>{

}
