package lab6.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lab6.library.library;
import lab6.repository.repository;
import lab6.service.updateservice;

@Service
public class update implements updateservice {

	@Autowired
	repository repository;

	@Override
	public library updatelibrary(library librarys) {
		long id = librarys.getId();
		library update = repository.findById(id).get();
		update.setFirstname(librarys.getFirstname());
		update.setLastname(librarys.getLastname());
		update.setCourse(librarys.getCourse());
		update.setCountry(librarys.getCountry());
		return repository.save(update);

	}

}
