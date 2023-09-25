package edu.jsp.uni_one_to_many;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindBank {

	public static void main(String[] args) {

		EntityManagerFactory factory=Persistence.createEntityManagerFactory("vikas");
		EntityManager manager=factory.createEntityManager();
		
		Bank bank= manager.find(Bank.class, 2);
		
		System.out.println("------------------------------------------");
		System.out.println("Bank id : "+bank.getId());
		System.out.println("Bank Name : "+bank.getName());
		System.out.println("Bank Ifsc : "+bank.getIfsc());
		System.out.println("------------------------------------------");
		List<Account> accounts=bank.getAccounts();
		for (Account account : accounts) {
			System.out.println("******************************************");
			System.out.println("Account id : "+account.getId());
			System.out.println("Account number : "+account.getNumber());
			System.out.println("Account balance : "+account.getBalance());	
		}
	}
}