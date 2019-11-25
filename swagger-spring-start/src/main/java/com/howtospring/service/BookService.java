package com.howtospring.service;

import com.howtospring.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    List<Book> getBooks();

    void createBook(Book book);

    Book getBook(long id);

    void deleteBook(long id);
}
