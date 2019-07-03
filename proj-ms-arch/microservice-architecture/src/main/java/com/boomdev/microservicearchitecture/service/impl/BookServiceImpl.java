package com.boomdev.microservicearchitecture.service.impl;

import com.boomdev.microservicearchitecture.model.Book;
import com.boomdev.microservicearchitecture.service.BookService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Service
public class BookServiceImpl implements BookService {


    @Override
    public List<Book> findAllBooks() {
        List books = new ArrayList();
        books.add(getBook("Spring"));
        books.add(getBook("Java"));
        return books;
    }

    @Override
    public Book findBookById(long bookId) {
        return getBook("Angular 7 - exist");
    }

    @Override
    public Book createBook(Book book) {
        return getBook("Python - create");
    }

    @Override
    public Book updateBook(Book book) {
        return getBook("Ruby - update");
    }

    @Override
    public Book updateBook(Map<String, String> updates, long bookId) {
        return getBook("Php - updates");
    }

    @Override
    public boolean deleteBook(long bookId) {
        return true;
    }

    private Book getBook(String title) {
        Book book = new Book();
        book.setId(getRandom());
        book.setTitle(title);
        book.setAuthor("Willy");
        return book;
    }

    private static int getRandom() {
        Random r = new Random();
        return r.nextInt(1000) + 10;
    }
}
