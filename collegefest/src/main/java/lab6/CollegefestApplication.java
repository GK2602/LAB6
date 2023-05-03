package lab6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lab6.library.library;
import lab6.service.createservice;
import lab6.service.deleteservice;
import lab6.service.printallservice;
import lab6.service.updateservice;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class CollegefestApplication implements CommandLineRunner {

	@Autowired
	createservice creation;

	@Autowired
	updateservice updateservice;

	@Autowired
	deleteservice deleteservice;

	@Autowired
	printallservice printallservice;

	public static void main(String[] args) {
		SpringApplication.run(CollegefestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		creationexecution();
		updateexecution();
		deleteexecution();
		printallexecution();
	}

	public void creationexecution() {
		log.info("library creaion->{}", creation.createlibrary(library.builder().id(1l).firstname("Suresh")
				.lastname("reddy").course("B.Tech").country("India").build()));
		log.info("library creaion->{}", creation.createlibrary(library.builder().id(2l).firstname("Murali")
				.lastname("Mohan").course("B.Arch").country("canada").build()));
		log.info("library creaion->{}", creation.createlibrary(library.builder().id(3l).firstname("Daniel")
				.lastname("Denson").course("B.Tech").country("New Zealand").build()));
		log.info("library creaion->{}", creation.createlibrary(library.builder().id(4l).firstname("gokul")
				.lastname("karthigeyan").course("B.Com").country("USA").build()));
		log.info("library creaion->{}", creation.createlibrary(library.builder().id(5l).firstname("naruto")
				.lastname("uzumaki").course("B.Com").country("USA").build()));
	}

	public void updateexecution() {
		log.info("library updation->{}", updateservice.updatelibrary(
				library.builder().id(4l).firstname("Tanya").lastname("Gupta").course("B.Com").country("USA").build()));
	}

	public void deleteexecution() {
		log.info(deleteservice.deletelibrary(5l));
	}

	public void printallexecution() {
		log.info("printing all libraries->{}", printallservice.printall());
	}

}
