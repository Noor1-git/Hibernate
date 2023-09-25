package edu.jsp.uni_one_to_one;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Engine {

	@Id
	private int id;
	private String name;
	private double cc;
	
	public Engine(int id, String name, double cc) {
		this.id = id;
		this.name = name;
		this.cc = cc;
	}
	
	public Engine() {
		
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
	public double getCc() {
		return cc;
	}
	public void setCc(double cc) {
		this.cc = cc;
	}
}