package edu.jsp.model.testdao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import edu.jsp.model.dao.UserDao;
import edu.jsp.model.entity.User;

class UserDaoTest {

	UserDao dao=new UserDao();
	
	@Test
	void testSaveUser() {
		
		User user=new User("abcd@email.com", 123456, "test@123");
		
		User daoUser=dao.saveUser(user);

//		check user is not null;
		assertNotNull(daoUser);
		
//		check whether we are getting same user or not;
		assertEquals(8, daoUser.getId());
		
	}

	
	@Test
	void testRemoveUser() {
		
		int id=2;
		
		User daouser=dao.removeUser(id);
		
		assertEquals(id, daouser.getId());
	}
	
	
	@Test
	void testUpdateUser() {
		int id=3;
		
		String email="test@email.com";
		
		User daouser=dao.updateUser(id, email);
		
		assertEquals(email, daouser.getEmail());
	}
	
	@Test
	void testSearchUser() {
		int id=3;
		
		User daoUser=dao.searchUser(id);
		
		assertEquals(id, daoUser.getId());
	}
}
