package edi.jsp.model.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.jsp.model.entity.User;

class UserDaoTest {

	UserDao dao=new UserDao();
	
	@Test
	void testSaveUser() {
		
		User user=new User();
		
		User daoUser=dao.saveUser(user);
		
		assertEquals(3, daoUser.getId());
		
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
