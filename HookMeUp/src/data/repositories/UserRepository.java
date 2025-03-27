package data.repositories;

import data.models.User;

import java.util.List;

public interface UserRepository{

    void Save(User user);
    List<User> findAll();
    long count();
    void delete(int id);
    Void delete(User user);
    User findUserById(int id);

}



