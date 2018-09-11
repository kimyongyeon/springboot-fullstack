package com.study.full.stack.fullstack_project.service;


import com.study.full.stack.fullstack_project.dto.BookDTO;

public interface BookRepository {
    BookDTO getByIsbn(String isbn);
}
