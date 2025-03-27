package data.repositories;

import data.models.User;

import java.util.ArrayList;
import java.util.List;

public class  Users implements UserRepository {

    final private List<User> users = new ArrayList<>();

    public Users(String name, String email, String password) {
        user
    }


    @Override
    public void Save(User user) {
        users.add(user);

    }

    @Override
    public List<User> findAll() {
        return List.of();
    }

    @Override
    public long count() {
        return this.users.size();
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Void delete(User user) {
        return null;
    }

    @Override
    public User findUserById(int id) {
        return null;
    }


}
