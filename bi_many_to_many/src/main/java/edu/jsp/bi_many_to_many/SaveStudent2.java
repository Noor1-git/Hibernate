package edu.jsp.bi_many_to_many;

import java.util.ArrayList;
import java.util.Arrays;
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
		
		Subject subject1=manager.find(Subject.class, 101);
		Subject subject2=new Subject(104, "SQL", 50);
		Subject subject3=manager.find(Subject.class, 102);
		
		List<Subject> list=new ArrayList<Subject>();
		list.add(subject1);
		list.add(subject2);
		list.add(subject3);
		
		Student student=new Student(2, "Anil", "ani@mail.com");
		List<Student> students=subject1.getStudents(); 
		students.add(student);
		List<Student> students1=subject3.getStudents(); 
		students1.add(student);
		subject2.setStudents(Arrays.asList(student));
		
		transaction.begin();
		manager.persist(student);
		manager.persist(subject2);
		transaction.commit();
	}
}