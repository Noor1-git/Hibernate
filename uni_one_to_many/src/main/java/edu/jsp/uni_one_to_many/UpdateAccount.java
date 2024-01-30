package edu.jsp.uni_one_to_many;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateAccount {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		Bank bank=entityManager.find(Bank.class, 2);
		List<Account> accounts=bank.getAccounts();
		
		for (Account account : accounts) {
			if (account.getId()==203) {
				entityTransaction.begin();
				account.setBalance(0);
				entityManager.merge(account);
				entityTransaction.commit();
				System.out.println("updated");
			}
		}
		
		
		
	}

}
