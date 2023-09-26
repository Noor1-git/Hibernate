package edi.jsp.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.jsp.model.entity.User;

public class UserDao {

	EntityManagerFactory factory=Persistence.createEntityManagerFactory("junit");
	EntityManager manager = factory.createEntityManager();

	public User saveUser(User user) {
		EntityTransaction transaction = manager.getTransaction();

		if (user != null) {
			transaction.begin();
			manager.persist(user);
			transaction.commit();
			return user;
		} else {
			return null;
		}
	}

	public User removeUser(int id) {
		User user=manager.find(User.class, id);
		EntityTransaction transaction = manager.getTransaction();

		if (user != null) {
			transaction.begin();
			manager.remove(user);
			transaction.commit();
			return user;
		} else {
			return null;
		}
	}
	
	public User updateUser(int id,String email) {
		User user=manager.find(User.class, id);
		EntityTransaction transaction = manager.getTransaction();
		
		if (user!=null) {
			transaction.begin();
			user.setEmail(email);
			manager.merge(user);
			transaction.commit();
			return user;
		} else {
			return null;
		}
	}

	public User searchUser(int id) {
		return manager.find(User.class, id);
	} 
}
