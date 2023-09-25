package edu.jsp.uni_one_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCar {

	public static void main(String[] args) {
		
		Engine engine=new Engine(101, "K2", 1400);
		
		Car car=new Car(1, 120000, "Swift", engine);
		
		
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager manager=managerFactory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		transaction.begin();
		
		manager.persist(car);
		manager.persist(engine);
		
		transaction.commit();
	}
}