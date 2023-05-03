package lab6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lab6.library.library;

@Repository
public interface repository extends JpaRepository<library, Long>{

}
