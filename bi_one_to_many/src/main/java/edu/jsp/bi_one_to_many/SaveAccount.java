package edu.jsp.bi_one_to_many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveAccount {

	public static void main(String[] args) {

		EntityManagerFactory factory=Persistence.createEntityManagerFactory("vikas");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Bank bank=new Bank(1, "SBI", "SBINOO413");
		
		Account account1=new Account(101, 563081, 3000, bank);
		Account account2=new Account(102, 263785, 4000, bank);
		Account account3=new Account(103, 579083, 6000, bank);
		
		List<Account> accounts=new ArrayList<Account>();
		accounts.add(account1);
		accounts.add(account2);
		accounts.add(account3);
		
		bank.setAccounts(accounts);
		
		transaction.begin();
		
		manager.persist(bank);
		manager.persist(account1);
		manager.persist(account2);
		manager.persist(account3);
		
		transaction.commit();
		
	}
}