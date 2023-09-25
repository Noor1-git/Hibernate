package edu.jsp.bi_many_to_many;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveStudent1 {

	public static void main(String[] args) {

		EntityManagerFactory factory=Persistence.createEntityManagerFactory("vikas");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Subject subject1=new Subject(101, "JAVA", 80);
		Subject subject2=new Subject(102, "SQL", 50);
		Subject subject3=new Subject(103, "MANUAL", 40);
		
		List<Subject> list=new ArrayList<Subject>();
		list.add(subject1);
		list.add(subject2);
		list.add(subject3);
		
		Student student=new Student(1, "Raju", "raj@mail.com");
		List<Student> students=Arrays.asList(student);
		subject1.setStudents(students);
		subject2.setStudents(students);
		subject3.setStudents(students);
		
		
		transaction.begin();
		manager.persist(student);
		manager.persist(subject1);
		manager.persist(subject2);
		manager.persist(subject3);
		transaction.commit();
	}

}
