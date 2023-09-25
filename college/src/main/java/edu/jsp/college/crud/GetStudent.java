package edu.jsp.college.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetStudent {

	public static void main(String[] args) {

		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager manager=managerFactory.createEntityManager();
		
		Student student=manager.find(Student.class, 4);
		System.out.println("----------------------------------------------");
		
		if (student!=null) {
			System.out.println("Rollno is : "+student.getRollno());
			System.out.println("Name is : "+student.getName());
			System.out.println("Email is : "+student.getEmail());
			System.out.println("Height is : "+student.getHeight());
		} else {
			System.out.println("Student not available");
		}
	}
}