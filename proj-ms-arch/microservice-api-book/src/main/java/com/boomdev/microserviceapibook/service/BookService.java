package com.boomdev.microserviceapibook.service;

import com.boomdev.microserviceapibook.model.Book;

import java.util.List;
import java.util.Map;

public interface BookService {

    List<Book> findAllBooks();

    Book findBookById(long bookId);

    Book createBook(Book book);

    Book updateBook(Book book);

    Book updateBook(Map<String, String> updates, long bookId);

    boolean deleteBook(long bookId);
}
