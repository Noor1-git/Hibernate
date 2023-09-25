package edu.jsp.bi_one_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetEngine {

	public static void main(String[] args) {

		EntityManagerFactory factory=Persistence.createEntityManagerFactory("vikas");
		EntityManager manager=factory.createEntityManager();
		
		Engine engine=manager.find(Engine.class, 101);
		
		System.out.println("----------------------------------------------------");
		System.out.println(engine.getId());
		System.out.println(engine.getName());
		System.out.println(engine.getCc());
		
		Car car=engine.getCar();
		
		System.out.println("----------------------------------------------------");
		System.out.println(car.getId());
		System.out.println(car.getName());
		System.out.println(car.getCost());
	}
}