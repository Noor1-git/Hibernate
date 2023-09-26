package edu.jsp.model.testdao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.jsp.model.dao.UserDao;
import edu.jsp.model.entity.User;

public class UserDaoTest2 {

    private EntityManagerFactory factory;
    private EntityManager manager;
    private UserDao userDao;

    @BeforeEach
    void setUp() {
        factory = Persistence.createEntityManagerFactory("junit");
        manager = factory.createEntityManager();
        userDao = new UserDao();
        userDao.manager = manager;
    }

    @AfterEach
    void tearDown() {
        if (manager != null) {
            manager.close();
        }
        if (factory != null) {
            factory.close();
        }
    }

    @Test
    void testSaveUser() {
        User user = new User();
        user.setEmail("test@example.com");

        User savedUser = userDao.saveUser(user);

        assertNotNull(savedUser);
        assertNotNull(savedUser.getId());

        User retrievedUser = manager.find(User.class, savedUser.getId());
        assertNotNull(retrievedUser);
        assertEquals("test@example.com", retrievedUser.getEmail());
    }

    @Test
    void testRemoveUser() {
        User user = new User();
        user.setEmail("test@example.com");

        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        manager.persist(user);
        transaction.commit();

        int userId = user.getId();

        User removedUser = userDao.removeUser(userId);
        assertNotNull(removedUser);

        User retrievedUser = manager.find(User.class, userId);
        assertNull(retrievedUser);
    }

    @Test
    void testUpdateUser() {
        User user = new User();
        user.setEmail("test@example.com");

        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        manager.persist(user);
        transaction.commit();

        int userId = user.getId();

        User updatedUser = userDao.updateUser(userId, "newemail@example.com");
        assertNotNull(updatedUser);

        User retrievedUser = manager.find(User.class, userId);
        assertNotNull(retrievedUser);
        assertEquals("newemail@example.com", retrievedUser.getEmail());
    }

    @Test
    void testSearchUser() {
        User user = new User();
        user.setEmail("test@example.com");

        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        manager.persist(user);
        transaction.commit();

        int userId = user.getId();

        User foundUser = userDao.searchUser(userId);
        assertNotNull(foundUser);
        assertEquals(userId, foundUser.getId());
    }
}
