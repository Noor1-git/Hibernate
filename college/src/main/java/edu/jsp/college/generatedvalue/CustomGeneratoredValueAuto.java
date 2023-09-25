package edu.jsp.college.generatedvalue;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.jsp.college.crud.Student;

public class CustomGeneratoredValueAuto {

//	INSIDE ENTITY CLASS.
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO,generator = "stu_rol_gen")
//	@SequenceGenerator(name="stu_rol_gen",initialValue = 100,allocationSize = 1,sequenceName = "stu_rol_gen")
//	private int rollno;
	
	public static void main(String[] args) {

		Student student=new Student();
		student.setName("scott");
		student.setEmail("sco@mail.com");
		student.setHeight(5.9);
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("vikas");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		transaction.begin();
		
		manager.persist(student);

		transaction.commit();
		
		System.out.println("Data saved");
	}

}
