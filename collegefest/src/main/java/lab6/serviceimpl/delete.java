package lab6.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lab6.repository.repository;
import lab6.service.deleteservice;

@Service
public class delete implements deleteservice {
	@Autowired
	repository repository;

	@Override
	public String deletelibrary(long id) {
		repository.deleteById(id);
		return "deleted";

	}

}
