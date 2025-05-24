// Placeholder for UserService.java
// File: user-service/src/main/java/com/example/user/UserService.java
package com.example.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepo;

    public List<User> getAll() {
        return userRepo.findAll();
    }

    public User create(User u) {
        return userRepo.save(u);
    }
}

