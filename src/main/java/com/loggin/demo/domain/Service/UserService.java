package com.loggin.demo.domain.Service;


import com.loggin.demo.domain.Entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User saveUser(User user);
    User getUser(String username);
    Optional<User> getUserById(Long id);
    List<User> getAllUser();
}
