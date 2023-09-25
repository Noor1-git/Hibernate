package edu.jsp.secondlvlcache;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BookCache {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = factory.createEntityManager();

		Book book = manager.find(Book.class, 1);

		System.out.println("++++++++++++++++++++++++++++++++++++++");
		System.out.println(book.getId());
		System.out.println(book.getName());
		System.out.println(book.getName());
		System.out.println("++++++++++++++++++++++++++++++++++++++");

		Book book1 = manager.find(Book.class, 1);

		System.out.println("++++++++++++++++++++++++++++++++++++++");
		System.out.println(book1.getId());
		System.out.println(book1.getName());
		System.out.println(book1.getName());
		System.out.println("++++++++++++++++++++++++++++++++++++++");

		EntityManager manager2 = factory.createEntityManager();

		Book book2 = manager2.find(Book.class, 1);

		System.out.println("++++++++++++++++++++++++++++++++++++++");
		System.out.println(book2.getId());
		System.out.println(book2.getName());
		System.out.println(book2.getName());
		System.out.println("++++++++++++++++++++++++++++++++++++++");

		Book book3 = manager2.find(Book.class, 2);

		System.out.println("++++++++++++++++++++++++++++++++++++++");
		System.out.println(book3.getId());
		System.out.println(book3.getName());
		System.out.println(book3.getName());
		System.out.println("++++++++++++++++++++++++++++++++++++++");
	}
}