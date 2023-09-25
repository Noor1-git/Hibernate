package edu.jsp.bi_one_to_one;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Engine {

	@Id
	private int id;
	private String name;
	private int cc;

	@OneToOne(mappedBy="engine")
	private Car car;

	public Engine() {
		super();
	}

	public Engine(int id, String name, int cc) {
		super();
		this.id = id;
		this.name = name;
		this.cc = cc;
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

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
}
