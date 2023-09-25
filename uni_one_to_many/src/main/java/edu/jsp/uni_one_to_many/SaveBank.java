package edu.jsp.uni_one_to_many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveBank {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
//		Account account=new Account(101, 123546, 3000);
//		Account account1=new Account(102, 986571, 4500);
//		Account account2=new Account(103, 659327, 10000);
//		
//		List<Account> accounts=new ArrayList<Account>();
//		accounts.add(account);
//		accounts.add(account1);
//		accounts.add(account2);
//		
//		Bank bank=new Bank(1, "SBI", "SBIN004", accounts);
//		
//		entityTransaction.begin();
//		
//		entityManager.persist(bank);
//		entityManager.persist(account);
//		entityManager.persist(account1);
//		entityManager.persist(account2);
//		
//		entityTransaction.commit();
		
		
		Account account=new Account(201, 654934, 5000);
		Account account1=new Account(202, 659875, 15000);
		Account account2=new Account(203, 968732, 25000);
		
		List<Account> accounts=new ArrayList<Account>();
		accounts.add(account);
		accounts.add(account1);
		accounts.add(account2);
		
		Bank bank=new Bank(2, "ICICI", "IC123", accounts);
		
		entityTransaction.begin();
		
		entityManager.persist(bank);
		entityManager.persist(account);
		entityManager.persist(account1);
		entityManager.persist(account2);
		
		entityTransaction.commit();
	}
}