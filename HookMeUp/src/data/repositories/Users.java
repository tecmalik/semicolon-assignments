package data.repositories;

import data.models.User;

import java.util.ArrayList;
import java.util.List;

public class  Users implements UserRepository {

    final private List<User> users = new ArrayList<>();
    int count;

    public Users(User user) {
    }


    @Override
    public User save(User user) {
        if (user == null) throw new IllegalArgumentException("user is null");
        if (isDuplicate(user)) return null;
        count+=1;
        String countString = Integer.toString(count);
        user.setUserID(countString);
        users.add(user);
        return null;
    }

    private boolean isDuplicate(User user) {
        if (user == null) throw new IllegalArgumentException("user is null");
        for (User object : users) {
            if (object.getEmail().equals(user.getEmail())) return true;
        }
        return false;
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
    public void delete(User user) {
        for (User object : users) {
            if (object.getUserID().equals(user.getUserID())) users.remove(object);
        }
    }

    @Override
    public User findUserById(String id) {
        if (id == null) throw new IllegalArgumentException("user is null");
        for (User user : users) {
            if (user.getUserID().equals(id)) return user;
        }
        return null;
    }


}
