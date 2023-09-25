package edu.jsp.college.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteStudent {

	public static void main(String[] args) {

		EntityManagerFactory factory=Persistence.createEntityManagerFactory("vikas");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Student student=manager.find(Student.class, 3);
		
		if (student!=null) {
			
			transaction.begin();
			
			manager.remove(student);
			
			transaction.commit();
			
			System.out.println("Record Deleted");
		} else {
			System.out.println("Record does not exists");
		}
	}
}