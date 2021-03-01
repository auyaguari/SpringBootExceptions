package edu.spring.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import edu.spring.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IStudentRepository extends CrudRepository<Student, Long> {
	
	public List<Student> findByFirstNameLike(String firstName);
	Page<Student> findByLastName(String criteria, Pageable pageable); 
}

