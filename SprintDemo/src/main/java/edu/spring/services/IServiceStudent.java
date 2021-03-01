package edu.spring.services;

import java.util.List;

import edu.spring.model.Student;

public interface IServiceStudent {
	public void save(Student student); //create-update
	public Student findById(Long id); //retrieve
	public void delete(Long id);	//delete
	public List<Student> findAll(); //list
	
	public List<Student> findByFirstName(String firstName);
	public List<Student> findByLastName(String criteria, int page, int size);
}	
