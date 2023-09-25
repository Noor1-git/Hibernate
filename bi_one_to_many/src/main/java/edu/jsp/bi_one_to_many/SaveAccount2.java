package edu.jsp.bi_one_to_many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveAccount2 {

	public static void main(String[] args) {

		EntityManagerFactory factory=Persistence.createEntityManagerFactory("vikas");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Bank bank=new Bank(2, "AXIS", "AXI911");
		
		Account account1=new Account(104, 918360, 13000, bank);
		Account account2=new Account(105, 883390, 4500, bank);
		Account account3=new Account(106, 796583, 6200, bank);
		
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
