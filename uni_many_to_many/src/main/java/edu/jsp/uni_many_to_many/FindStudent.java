package edu.jsp.uni_many_to_many;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindStudent {

	public static void main(String[] args) {

		EntityManagerFactory factory=Persistence.createEntityManagerFactory("vikas");
		EntityManager manager=factory.createEntityManager();
		
		Student student=manager.find(Student.class, 2);
		
		List<Subject> list=student.getList();
		
		System.out.println("-----------------------------------");
		System.out.println("Student id : "+student.getId());
		System.out.println("Student name : "+student.getName());
		System.out.println("Student email : "+student.getEmail());
		System.out.println("-----------------------------------");
		for (Subject subject : list) {

			System.out.println("-------------------------------");
			System.out.println("Subject id : "+subject.getId());
			System.out.println("Subject name : "+subject.getName());
			System.out.println("Subject duration : "+subject.getDuration());
		}
		
	}

}
