package com.tech.about.service;

import java.util.List;
import java.util.Optional;

import com.tech.about.model.About;

public interface IAboutService {

	public List<About> sGet();

	public Optional<About> sGetAboutById(Long id);

	public About sSave(About about);

	public About sPut(About about);

	public void sDelete(Long id);

}
