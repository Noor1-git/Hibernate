package edu.jsp.uni_many_to_many;

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
	
	@ManyToMany
	private List<Subject> list;
	
	public List<Subject> getList() {
		return list;
	}
	public void setList(List<Subject> list) {
		this.list = list;
	}
	public Student(int id, String name, String email,List<Subject> list) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.list=list;
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