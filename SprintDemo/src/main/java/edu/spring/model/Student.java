package edu.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Table(name="Students")
@Entity
public class Student {
	@Id
	@Column(name="id_student")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idStudent;
	@NotEmpty(message = "Ingrese un nombre")
	@Column(name="first_name")
	@NotNull
	@Size(min=2, message="El fistName debe tener al menos 2 caracteres")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	public Student() {	
		
	}
	public Student(Long idStudent) {
		this.idStudent = idStudent;
	}
	public Long getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(Long idStudent) {
		this.idStudent = idStudent;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
