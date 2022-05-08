package com.bookings.stayclassy.service;

import com.bookings.stayclassy.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getUsers();

    Optional<User> getUser(Integer id);

    void saveUser(User user);
}
