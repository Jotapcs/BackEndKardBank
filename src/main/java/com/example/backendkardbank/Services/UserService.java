package com.example.backendkardbank.Services;

import com.example.backendkardbank.Model.User;
import com.example.backendkardbank.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();

    }

    public Optional<User> findById(Integer id) {
        return userRepository.findById(id);

    }

    public User add(User user) {
        return userRepository.save(user);

    }

    public void delete(Integer id) {
        userRepository.findById(id);

    }

    public User update(Integer id, User user) {
        user.setId(id);
        return userRepository.save(user);

    }
}
