package com.Library_Management_System.Library_Management_System.repository;

import com.Library_Management_System.Library_Management_System.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>
{

}
