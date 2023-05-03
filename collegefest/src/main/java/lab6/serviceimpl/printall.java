package lab6.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lab6.library.library;
import lab6.repository.repository;
import lab6.service.printallservice;

@Service
public class printall implements printallservice {

	@Autowired
	repository repository;

	@Override
	public List<library> printall() {
		return repository.findAll();

	}

}
