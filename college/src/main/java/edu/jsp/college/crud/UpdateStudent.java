package edu.jsp.college.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateStudent {

	public static void main(String[] args) {

		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager manager=managerFactory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Student student=manager.find(Student.class, 3);
		
		if (student!=null) {
			
			student.setHeight(5.8);
			transaction.begin();
			manager.merge(student);
			transaction.commit();
			
			System.out.println("Record Updated");
		} else {
			System.out.println("Student doesnot exist");
		}
	}
}