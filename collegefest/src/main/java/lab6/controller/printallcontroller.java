package lab6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lab6.library.library;
import lab6.service.printallservice;

@RestController
public class printallcontroller {

	@Autowired
	printallservice printallservice;

	@GetMapping("/view")
	public List<library> printall() {
		return printallservice.printall();
	}
}
