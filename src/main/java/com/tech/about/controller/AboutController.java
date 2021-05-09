package com.tech.about.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.about.model.About;
import com.tech.about.service.IAboutService;

@RestController
@RequestMapping("/about")
@CrossOrigin(origins = "*")
public class AboutController {
	
	private IAboutService iAboutService;

	@Autowired
	public AboutController(IAboutService iAboutService) {
		this.iAboutService = iAboutService;
	}
	
	@GetMapping("/test")
	public ResponseEntity<String> aboutTesting() {
		return new ResponseEntity<>("ok" ,HttpStatus.OK);
	}
	
	@GetMapping("/getAbout")
	public ResponseEntity<List<About>> cGetAbout(){
		 List<About> list = this.iAboutService.sGet();
		 return new ResponseEntity<>(list ,HttpStatus.OK);
	}
	
	@GetMapping("/getAboutById/{id}")
	public ResponseEntity<Optional<About>> cGetAboutById(@PathVariable("id") Long id){
		 Optional<About> sGetAboutById = this.iAboutService.sGetAboutById(id);
		 return new ResponseEntity<>(sGetAboutById , HttpStatus.FOUND);
	}
	
	@PostMapping("/postAbout")
	public ResponseEntity<About> cPostAbout(@RequestBody About about) {
		 About sSave = this.iAboutService.sSave(about);
		 return new ResponseEntity<>(sSave, HttpStatus.CREATED);
	}
	
	@PutMapping("/putAbout")
	public ResponseEntity<About> cPutUser(@RequestBody About about) {
		 About sPut = this.iAboutService.sPut(about);
		 return new ResponseEntity<>(sPut, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> cDeleteUser(@PathVariable("id") Long id) {
		this.iAboutService.sDelete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
