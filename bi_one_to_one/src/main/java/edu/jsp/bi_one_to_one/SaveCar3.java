package edu.jsp.bi_one_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCar3 {

	public static void main(String[] args) {

		EntityManagerFactory factory=Persistence.createEntityManagerFactory("vikas");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Car car=new Car(3, "XUV700", 2000000);
		
		Engine engine=new Engine(103, "M20", 2000);
		
		car.setEngine(engine);
		engine.setCar(car);
		
		transaction.begin();
		
		manager.persist(car);
		manager.persist(engine);
		
		transaction.commit();
		
	}

}
