package edu.jsp.college.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertStudent {

	public static void main(String[] args) {

		Student student=new Student();
		student.setRollno(4);
		student.setName("james");
		student.setEmail("jam@mail.com");
		student.setHeight(6.1);
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("vikas");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		transaction.begin();
		
		manager.persist(student);

		transaction.commit();
		
		System.out.println("Data saved");
	}

}
