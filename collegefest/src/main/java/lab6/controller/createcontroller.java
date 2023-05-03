package lab6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lab6.library.library;
import lab6.service.createservice;

@RestController
public class createcontroller {

	@Autowired
	createservice createservice;

	@GetMapping("/")
	public String home() {
		return ("<h1> Great learning</h1>");
	}

	@PostMapping("/creation")
	public String createlibrary(library librarys) {
		return createservice.createlibrary(librarys);
	}

}
