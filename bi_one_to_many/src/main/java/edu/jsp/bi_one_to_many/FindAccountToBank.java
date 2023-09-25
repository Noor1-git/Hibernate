package edu.jsp.bi_one_to_many;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindAccountToBank {

	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("vikas");
		EntityManager manager=factory.createEntityManager();
		
		Account account=manager.find(Account.class, 101);
		
		System.out.println("-------------------------------------");
		System.out.println(account.getId());
		System.out.println(account.getAccountNumber());
		System.out.println(account.getBalance());
		
		Bank bank=account.getBank();
		System.out.println("=====================================");
		System.out.println(bank.getId());
		System.out.println(bank.getName());
		System.out.println(bank.getIfsc());
	}

}
