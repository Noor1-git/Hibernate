package edu.jsp.uni_many_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveReview {

	public static void main(String[] args) {

		EntityManagerFactory factory=Persistence.createEntityManagerFactory("vikas");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Product product=new Product(2, "Laptop", 150000);
		
		Review review=new Review(4, "Good", "Best in segment", product);
		Review review1=new Review(5, "Heating", "Laptop is Heating", product);
		Review review2=new Review(6, "Bad product", "Exepnsive", product);
	
		transaction.begin();
		
		manager.persist(product);
		manager.persist(review);
		manager.persist(review1);
		manager.persist(review2);
		
		transaction.commit();
		
		
	}

}
