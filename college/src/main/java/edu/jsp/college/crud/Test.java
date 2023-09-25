package edu.jsp.college.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {

		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager manager=managerFactory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Student student=new Student();
		
		transaction.begin();
		manager.persist(student);
		manager.remove(student);
	}
}