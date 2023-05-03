package lab6.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lab6.library.library;
import lab6.repository.repository;
import lab6.service.createservice;

@Service
public class create implements createservice {
	
	@Autowired
	repository repository;
	
	@Override
	public String createlibrary(library librarys) {
		repository.saveAndFlush(librarys);
		return "library saved";
	}

}
