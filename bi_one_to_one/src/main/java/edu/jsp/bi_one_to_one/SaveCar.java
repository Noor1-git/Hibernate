package edu.jsp.bi_one_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCar {

	public static void main(String[] args) {

		EntityManagerFactory factory=Persistence.createEntityManagerFactory("vikas");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Car car=new Car(1, "City", 1300000);
		
		Engine engine=new Engine(101, "H15", 1500);
		
		car.setEngine(engine);
		engine.setCar(car);
		
		transaction.begin();
		
		manager.persist(car);
		manager.persist(engine);
		
		transaction.commit();
		
	}

}
