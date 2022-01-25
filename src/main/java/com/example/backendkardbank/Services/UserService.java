package com.example.backendkardbank.Services;

import com.example.backendkardbank.Model.User;
import com.example.backendkardbank.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> obterTodos() {
        return userRepository.findAll();

    }

    public User inserir(User user) {
        return userRepository.save(user);

    }

    public void excluir(Integer id) {
        userRepository.findById(id);

    }

    public User atualizar(Integer id, User user) {
        user.setId(id);
        return userRepository.save(user);

    }
}
