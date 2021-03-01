package edu.spring.controllers;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RequestParam;
import edu.spring.services.IServiceStudent;
import edu.spring.model.Student;
import edu.spring.exceptions.StudentNotFoundException;
import javax.validation.Valid;


@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private IServiceStudent service;
	
	@GetMapping("")
	public List<Student> findAll(){
		return service.findAll();
	}
	@GetMapping("/studentspage")
	public List<Student> findByLastName(
			@RequestParam(defaultValue = "") String lastName,
			@RequestParam (defaultValue = "0") int page,
			@RequestParam (defaultValue = "3") int size){
		return service.findByLastName(lastName, page, size);
	}
	@GetMapping("/students/{id}")
	public Student retrieveStudent(@PathVariable long id) {
		Student student = service.findById(id);

		if (student == null)
			throw new StudentNotFoundException( id);

		//EntityModel<Student> resource = EntityModel.of(student.get());

		//WebMvcLinkBuilder linkTo = linkTo(methodOn(this.getClass()).retrieveAllStudents());

		//resource.add(linkTo.withRel("all-students"));

		return student;
	}
	
	@PostMapping("save")
	@ResponseStatus(HttpStatus.CREATED)
	public Student save(@Valid @RequestBody Student student) {
		service.save(student);
		return student;
	}
	
	
}
