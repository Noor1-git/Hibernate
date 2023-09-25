package edu.jsp.uni_one_to_one;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Car {

	@Id
	private int id;
	private double cost;
	private String name;
	
	@OneToOne
	private Engine engine;
	
	public Car() {
	}
	
	public Car(int id, double cost, String name, Engine engine) {
		this.id = id;
		this.cost = cost;
		this.name = name;
		this.engine = engine;
	}
	
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
