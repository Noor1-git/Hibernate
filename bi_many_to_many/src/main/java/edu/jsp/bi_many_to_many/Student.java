package edu.jsp.bi_many_to_many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {

	@Id
	private int id;
	private String name;
	private String email;
	
	@ManyToMany(mappedBy="students")
	private List<Subject> subjects;
	
	public List<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subject> list) {
		this.subjects = list;
	}
	public Student(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public Student() {

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}