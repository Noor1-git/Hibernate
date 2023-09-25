package edu.jsp.uni_one_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindCar {

	public static void main(String[] args) {

		EntityManagerFactory factory=Persistence.createEntityManagerFactory("vikas");
		EntityManager manager=factory.createEntityManager();
		
		Car car=manager.find(Car.class, 1);
		System.out.println("-------------------------------------------------------");
		System.out.println("id : "+car.getId());
		System.out.println("name is : "+car.getName());
		System.out.println("cost is : "+car.getCost());
		
		Engine engine=car.getEngine();
		System.out.println("-------------------------------------------------------");
		System.out.println("id : "+engine.getId());
		System.out.println("cc is : "+engine.getCc());
		System.out.println("name is : "+engine.getName());
		
	}

}
