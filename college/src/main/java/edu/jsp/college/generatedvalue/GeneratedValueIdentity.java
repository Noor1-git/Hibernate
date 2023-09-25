package edu.jsp.college.generatedvalue;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.jsp.college.crud.Student;

public class GeneratedValueIdentity {

//	INSIDE ENTITY CLASS;
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int rollno;
	
	public static void main(String[] args) {

		Student student=new Student();
		student.setName("smith");
		student.setEmail("smi@mail.com");
		student.setHeight(6.1);
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("vikas");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		transaction.begin();
		
		manager.persist(student);

		transaction.commit();
		
		System.out.println("Data saved");
	}

}
