package edu.jsp.bi_one_to_many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bank {

	@Id
	private int id;
	private String name;
	private String ifsc;
	
	@OneToMany(mappedBy = "bank")
	private List<Account> accounts;
	
	public Bank() {
		super();
	}
	public Bank(int id, String name, String ifsc) {
		super();
		this.id = id;
		this.name = name;
		this.ifsc = ifsc;
	}
	
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
}