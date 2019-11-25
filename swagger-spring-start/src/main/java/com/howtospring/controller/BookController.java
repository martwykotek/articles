package com.howtospring.controller;

import com.howtospring.model.Book;
import com.howtospring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    private List<Book> getAll(){
        return bookService.getBooks();
    }

    @GetMapping("/{id}")
    private Book getOne(@PathVariable long id){
        return bookService.getBook(id);
    }

    @PostMapping("/create")
    private ResponseEntity create(@Valid @RequestBody Book book){
        bookService.createBook(book);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    private ResponseEntity delete(@PathVariable long id){
        bookService.deleteBook(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
