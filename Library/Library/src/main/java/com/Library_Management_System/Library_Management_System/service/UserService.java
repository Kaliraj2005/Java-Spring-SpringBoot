package com.Library_Management_System.Library_Management_System.service;

import com.Library_Management_System.Library_Management_System.entity.User;
import com.Library_Management_System.Library_Management_System.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService
{
    @Autowired
    private UserRepository userRepository;
    public List<User> findAll()
    {
        return userRepository.findAll();
    }
    public User save(User user)
    {
        return userRepository.save(user);
    }
}
