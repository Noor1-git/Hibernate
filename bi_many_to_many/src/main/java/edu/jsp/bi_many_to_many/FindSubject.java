package edu.jsp.bi_many_to_many;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindSubject {

	public static void main(String[] args) {

		EntityManagerFactory factory=Persistence.createEntityManagerFactory("vikas");
		EntityManager manager=factory.createEntityManager();
		
		Subject subject=manager.find(Subject.class, 104);
		
		System.out.println("-------------------------------");
		System.out.println(subject.getId());
		System.out.println(subject.getName());
		System.out.println(subject.getDuration());
		
		List<Student> students=subject.getStudents();
		for (Student student : students) {
			System.out.println("===========================");
			System.out.println(student.getId());
			System.out.println(student.getName());
			System.out.println(student.getEmail());
		}
		
		
	}

}
