package com.ID_6405620.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ID_6405620.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {}
