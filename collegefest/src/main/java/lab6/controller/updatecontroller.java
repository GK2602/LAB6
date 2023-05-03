package lab6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lab6.library.library;
import lab6.service.updateservice;

@RestController
public class updatecontroller {

	@Autowired
	updateservice updateservice;

	@GetMapping("/update")
	public library updatelibrary(library librarys) {
		return updateservice.updatelibrary(librarys);
	}

}
