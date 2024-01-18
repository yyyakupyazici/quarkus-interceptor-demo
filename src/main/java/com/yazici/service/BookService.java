package com.yazici.service;

import java.util.List;
import com.yazici.dto.Book;
import com.yazici.interceptor.BookServiceInterceptorBinding;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BookService {

    @BookServiceInterceptorBinding
    public List<Book> getBooks(String id, String name) {
        var book = new Book();
        book.setAuthor("Victor Hugo");
        book.setName("Sefiller");
        book.setIsbn("123456");
        return List.of(book);

    }
}
