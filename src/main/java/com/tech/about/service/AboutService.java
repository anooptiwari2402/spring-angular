package com.tech.about.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.about.dao.IAboutDao;
import com.tech.about.model.About;

@Service
public class AboutService implements IAboutService{
	
	private IAboutDao iAboutDao;

	@Autowired
	public AboutService(IAboutDao iAboutDao) {
		this.iAboutDao = iAboutDao;
	}

	@Override
	public List<About> sGet() {
		return this.iAboutDao.findAll();
	}

	@Override
	public Optional<About> sGetAboutById(Long id) {
		return this.iAboutDao.findById(id);
	}

	@Override
	public About sSave(About about) {
		return this.iAboutDao.save(about);
	}

	@Override
	public About sPut(About about) {
		return this.iAboutDao.save(about);
	}

	@Override
	public void sDelete(Long id) {
		this.iAboutDao.deleteById(id);
	}

}
