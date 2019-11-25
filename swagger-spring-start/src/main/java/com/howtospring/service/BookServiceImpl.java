package com.howtospring.service;

import com.howtospring.model.Book;
import com.howtospring.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @Override
    public void createBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public Book getBook(long id) {
        return bookRepository.getOne(id);
    }

    @Override
    public void deleteBook(long id) {
        bookRepository.deleteById(id);
    }
}
