package com.maithri.service;

import java.util.List;

import com.maithri.model.User;
import com.maithri.model.UserDto;

public interface UserService {

    User save(UserDto user);
    List<User> findAll();
    void delete(long id);
    User findOne(String username);

    User findById(Long id);
}
