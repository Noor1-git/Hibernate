package edu.jsp.uni_many_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindReview {

	public static void main(String[] args) {

		EntityManagerFactory factory=Persistence.createEntityManagerFactory("vikas");
		EntityManager manager=factory.createEntityManager();
		
		Review review=manager.find(Review.class, 6);
		
		System.out.println("----------------------------------");
		System.out.println(review.getId());
		System.out.println(review.getHeading());
		System.out.println(review.getMessage());
		
		Product product=review.getProduct();
		System.out.println("----------------------------------");
		System.out.println("Product id : "+product.getId());
		System.out.println("Product name : "+product.getName());
		System.out.println("Product cost : "+product.getCost());
				
	}
}