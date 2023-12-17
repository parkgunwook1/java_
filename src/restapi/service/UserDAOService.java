package restapi.service;

import restapi.model.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDAOService {
    private static List<User> users = new ArrayList<>();
    private static int usersCount = 3;

    static {
        users.add(new User(1,"Moon", new Date()));

    }
    public List<User> findAll() {
        return users;
    }
}
