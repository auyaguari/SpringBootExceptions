package edu.spring.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import edu.spring.model.Student;

public interface IStudentJpaRepository extends JpaRepository<Student, Long> {
	
	Page<Student> findByLastName(String criteria, Pageable pageable); 
	public List<Student> findByFirstNameLike(String firstName);
}
