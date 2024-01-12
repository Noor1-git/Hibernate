package edu.jsp.uni_one_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateEngine {

	public static void main(String[] args) {

		EntityManagerFactory factory=Persistence.createEntityManagerFactory("vikas");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Car car=manager.find(Car.class, 1);
		
		Engine engine=car.getEngine();
		
		transaction.begin();
		engine.setName("k3");
		manager.merge(engine);
		transaction.commit();
	}

}
