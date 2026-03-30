package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    @Cacheable(value = "users", key = "#id")
    public User getUser(Long id) {
        System.out.println("Fetching from DB...");
        return repo.findById(id).orElse(null);
    }

    @CachePut(value = "users", key = "#result.id")
    public User save(User user) {
        return repo.save(user);
    }

    @CacheEvict(value = "users", key = "#id")
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
