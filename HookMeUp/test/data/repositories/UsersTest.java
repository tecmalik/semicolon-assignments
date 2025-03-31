package data.repositories;


import data.models.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UsersTest {

    @Test
    void A_UserCanBeSaved_Test() {
        User user = new User();
        user.setName("name");
        user.setEmail("user@gmail.com");
        user.setPassword("password");
        Users users = new Users(user);
        users.save(user);
        assertEquals(1L , users.count());
    }

    @Test
    void UserDuplicateCanNotBeSaved(){
        User user1 = new User();
        user1.setName("name");
        user1.setEmail("user@gmail.com");
        user1.setPassword("password");
        Users users = new Users(user1);
        users.save(user1);
        assertEquals(1L , users.count());
        User user2 = new User();
        user2.setName("name");
        user2.setEmail("user@gmail.com");
        user2.setPassword("password");
        users.save(user2);
        assertEquals(1L , users.count());
    }
    @Test
    void CheckThatUsersCanBeFoundByIDTest(){
        User user1 = new User();
        user1.setName("name");
        user1.setEmail("user@gmail.com");
        user1.setPassword("password");
        Users users = new Users(user1);
        users.save(user1);
        assertEquals(users.findUserById("1") , user1);

    }

    @Test
    void UserCanBeDeletedTest(){
        User user1 = new User();
        user1.setName("name");
        user1.setEmail("user@gmail.com");
        user1.setPassword("password");
        Users users = new Users(user1);
        users.save(user1);
        assertEquals(1L , users.count());
        User user2 = new User();
        user2.setName("name1");
        user2.setEmail("user1@gmail.com");
        user2.setPassword("password");
        users.save(user2);
        assertEquals(2L , users.count());
        users.delete(user1);
        assertEquals(1L , users.count());
    }

    @Test
    void findAll() {
    }

    @Test
    void count() {
    }

    @Test
    void delete() {
    }

    @Test
    void testDelete() {
    }

    @Test
    void findUserById() {
    }
}