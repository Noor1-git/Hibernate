package edu.jsp.college.generatedvalue;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.jsp.college.crud.Student;

public class GeneratedValueSequence {

//	INSIDE ENTITY CLASS;
//	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "stu_gen_seq")
//	@SequenceGenerator(name="stu_gen_seq",initialValue = 100,allocationSize = 1,sequenceName = "stu_seq")
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
