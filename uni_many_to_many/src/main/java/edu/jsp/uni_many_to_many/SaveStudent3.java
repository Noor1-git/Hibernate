package edu.jsp.uni_many_to_many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveStudent3 {

	public static void main(String[] args) {
		
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("vikas");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Subject subject1=manager.find(Subject.class, 101);
		Subject subject2=manager.find(Subject.class, 102);
		Subject subject3=manager.find(Subject.class, 103);
		
		List<Subject> subjects=new ArrayList<>();
		
		subjects.add(subject1);
		subjects.add(subject2);
		subjects.add(subject3);
		
		Student student=new Student(50, "Bheem", "BHI@mail.com", subjects);
		
		transaction.begin();
		manager.persist(student);
		transaction.commit();
		
	}
	
}
