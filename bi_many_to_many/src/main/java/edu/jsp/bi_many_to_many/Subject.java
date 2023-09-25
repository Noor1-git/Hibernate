package edu.jsp.bi_many_to_many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Subject {

	@Id
	private int id;
	private String name;
	private int duration;
	
	@ManyToMany
	@JoinTable(joinColumns = @JoinColumn(name="my_subject_id"),
							  inverseJoinColumns = @JoinColumn(name="my_student_id"))
	private List<Student> students;
	
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Subject() {

	}
	
	public Subject(int id, String name, int duration) {
		this.id = id;
		this.name = name;
		this.duration = duration;
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
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
}
