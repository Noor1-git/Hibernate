package edu.jsp.hibernateproject;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProjectTest {

	public static void main(String[] args) {
		
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("vikas");
		System.out.println(managerFactory);
	}
}