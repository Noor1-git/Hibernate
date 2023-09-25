package edu.jsp.bi_one_to_many;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Account {

	@Id
	private int id;
	private long accountNumber;
	private double balance;
	
	@ManyToOne
	@JoinColumn(name="bank_id")
	private Bank bank;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public Account(int id, long accountNumber, double balance, Bank bank) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.bank = bank;
	}

	public Account() {
		super();
	}
}