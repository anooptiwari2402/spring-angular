package com.tech.about.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tech.about.model.About;

@Repository
public interface IAboutDao extends JpaRepository<About, Long>{

}
