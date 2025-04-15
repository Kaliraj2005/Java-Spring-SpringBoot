package com.Library_Management_System.Library_Management_System.Controller;

import com.Library_Management_System.Library_Management_System.entity.User;
import com.Library_Management_System.Library_Management_System.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController
{
    @Autowired
    private UserService userService;
    @GetMapping
    public List<User> getAllUsers()
    {
        return userService.findAll();
    }
    @PostMapping
    public User addUser(@RequestBody User user)
    {
        return userService.save(user);
    }
}
