package com.example.demo.service;

import com.example.demo.model.User;

import java.util.Optional;

public interface IUserService {
    Optional<User> findByUsername(String username); // Tim kiem user co ton tai trong DB k?
    Boolean existsByUsername(String username); // username da co trong DB chua, khi tao du lieu
    Boolean existsByEmail(String email); // email da to tai chua?
    User save(User user);
}
