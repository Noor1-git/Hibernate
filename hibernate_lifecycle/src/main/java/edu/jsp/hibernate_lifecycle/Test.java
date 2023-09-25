package edu.jsp.hibernate_lifecycle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {
	
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("vikas");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction entityTransaction=manager.getTransaction();
		
		
		Student student=new Student();
		student.setName("Shree");
		student.setDivision("A");
		
		entityTransaction.begin();
		System.out.println(student.getId());
		manager.persist(student);
		System.out.println(student.getId());
		entityTransaction.commit();
		
		EntityManager manager1=factory.createEntityManager();
		EntityTransaction entityTransaction1=manager1.getTransaction();
		
		Student s1= manager1.find(Student.class,14);
		
		entityTransaction1.begin();
		s1.setName("Noor");
		manager1.merge(s1);
		entityTransaction1.commit();
		
		
		Student s11= manager1.find(Student.class,14);
		System.out.println(s11.getName());
		
		
		Student s= manager.find(Student.class,14);
		System.out.println(s.getName());
		
		
	}
}