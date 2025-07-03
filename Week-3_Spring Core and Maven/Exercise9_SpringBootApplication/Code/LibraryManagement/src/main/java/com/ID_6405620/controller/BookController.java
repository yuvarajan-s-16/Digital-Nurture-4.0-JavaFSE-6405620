package com.ID_6405620.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.ID_6405620.model.Book;
import com.ID_6405620.repository.BookRepository;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookRepository bookRepo;

    public BookController(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookRepo.save(book);
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable int id) {
        return bookRepo.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable int id) {
        bookRepo.deleteById(id);
    }
}
