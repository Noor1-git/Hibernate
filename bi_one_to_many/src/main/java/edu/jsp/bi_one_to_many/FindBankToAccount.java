package edu.jsp.bi_one_to_many;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindBankToAccount {

	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("vikas");
		EntityManager manager=factory.createEntityManager();
		
		Bank bank=manager.find(Bank.class, 1);
		
		System.out.println("--------------------------------------");
		System.out.println(bank.getId());
		System.out.println(bank.getName());
		System.out.println(bank.getIfsc());
		System.out.println("--------------------------------------");
		List<Account> accounts=bank.getAccounts();
		
		for (Account account : accounts) {
			System.out.println("===================================");
			System.out.println(account.getId());
			System.out.println(account.getAccountNumber());
			System.out.println(account.getBalance());
		}
		
		
	}

}
