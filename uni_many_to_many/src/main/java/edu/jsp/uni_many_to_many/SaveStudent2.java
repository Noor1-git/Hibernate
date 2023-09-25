package edu.jsp.uni_many_to_many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveStudent2 {

	public static void main(String[] args) {

		EntityManagerFactory factory=Persistence.createEntityManagerFactory("vikas");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Subject subject4=manager.find(Subject.class, 101);
		Subject subject5=new Subject(104, "HTML", 60);
		Subject subject6=manager.find(Subject.class, 102);
		
		List<Subject> list=new ArrayList<Subject>();
		list.add(subject4);
		list.add(subject5);
		list.add(subject6);
		
		
		Student student1=new Student(2, "Anil", "anil@mail.com", list);
		
		transaction.begin();
		manager.persist(student1);
		manager.persist(subject4);
		manager.persist(subject5);
		manager.persist(subject6);
		transaction.commit();
	}
}