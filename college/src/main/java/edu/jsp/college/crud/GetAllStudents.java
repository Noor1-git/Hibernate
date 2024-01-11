package edu.jsp.college.crud;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class GetAllStudents {

	public static void main(String[] args) {

		EntityManagerFactory factory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=factory.createEntityManager();
		
		Query query =entityManager.createQuery("SELECT s FROM Student s");
		
		List<Student> list=query.getResultList();
		System.out.println("\n---------------------------------------------");
		for (Student student : list) {
			System.out.println("roll no : "+student.getRollno());
			System.out.println("Name is : "+student.getName());
			System.out.println("Email is : "+student.getEmail());
			System.out.println("Height is : "+student.getHeight());
			System.out.println("-------------------------------------------");
		}
	}
}