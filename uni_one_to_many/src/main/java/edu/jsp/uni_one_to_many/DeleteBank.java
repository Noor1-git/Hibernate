package edu.jsp.uni_one_to_many;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteBank {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		Bank bank=entityManager.find(Bank.class, 2);
		
		entityTransaction.begin();
		entityManager.remove(bank);
		entityTransaction.commit();
		System.out.println("Deleted");
		
	}

}
