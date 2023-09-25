package edu.jsp.college.crud;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE,generator = "stu_gen_tab")
	@TableGenerator(name="stu_gen_tab",initialValue = 100,allocationSize = 1,table = "stu_seq_tab")
	private int rollno;
	private String name;
	private String email;
	private double height;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
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
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
}