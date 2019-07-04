package com.boomdev.microserviceapibook.controller;

import com.boomdev.microserviceapibook.model.Book;
import com.boomdev.microserviceapibook.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping
    public List<Book> findAllBooks() {return service.findAllBooks();}

    @GetMapping("/{bookId}")
    public Book findBook(@PathVariable Long bookId) {return service.findBookById(bookId);}

    @PostMapping
    public Book createBook(@RequestBody Book book) {return service.createBook(book);}

    @PutMapping
    public Book updateBook(@RequestBody Book book) {return service.updateBook(book);}

    @PatchMapping("/{bookId}")
    public Book updateBook(@RequestBody Map<String, String> updates, @PathVariable Long bookId) {return service.updateBook(updates, bookId);}

    @DeleteMapping("/{bookId}")
    public boolean deleteBook(@PathVariable Long bookId) {return service.deleteBook(bookId);}
}
