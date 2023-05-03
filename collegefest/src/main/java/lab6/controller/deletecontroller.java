package lab6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lab6.service.deleteservice;

@RestController
public class deletecontroller {
	@Autowired
	deleteservice deleteservice;

	@GetMapping("/deleteit")
	public String deletelibrary(long id) {
		return deleteservice.deletelibrary(id);
	}

}
