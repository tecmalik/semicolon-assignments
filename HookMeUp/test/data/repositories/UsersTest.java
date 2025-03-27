package data.repositories;


import data.models.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UsersTest {

    @Test
    void A_UserCanBeSaved_Test() {
        Users users = new Users("name","email","password");
        User user = new User();
        users.Save(user);
        assertEquals(1L , users.count());
    }

    @Test
    void UserDuplicateCanNotBeSaved(){
        Users users = new Users("name","email","password");


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