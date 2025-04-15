package com.Library_Management_System.Library_Management_System.repository;

import com.Library_Management_System.Library_Management_System.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long>
{

}