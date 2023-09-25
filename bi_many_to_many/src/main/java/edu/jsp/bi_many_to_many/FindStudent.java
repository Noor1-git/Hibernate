package edu.jsp.bi_many_to_many;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindStudent {

	public static void main(String[] args) {

		EntityManagerFactory factory=Persistence.createEntityManagerFactory("vikas");
		EntityManager manager=factory.createEntityManager();
		
		Student student=manager.find(Student.class, 1);
		
		System.out.println("------------------------------");
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getEmail());
		System.out.println("-------------------------------");
		
		List<Subject> list=student.getSubjects();
		for (Subject subject : list) {
			
			System.out.println("+++++++++++++++++++++++++++");
			System.out.println(subject.getId());
			System.out.println(subject.getName());
			System.out.println(subject.getDuration());
		}
		
		
	}

}
