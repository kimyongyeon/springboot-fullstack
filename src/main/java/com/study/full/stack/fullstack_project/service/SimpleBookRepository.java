package com.study.full.stack.fullstack_project.service;

import com.study.full.stack.fullstack_project.dto.BookDTO;
import org.springframework.stereotype.Component;

@Component
public class SimpleBookRepository implements BookRepository {
    @Override
//    @Cacheable("books")
    public BookDTO getByIsbn(String isbn) {
        simulateSlowService();
        return new BookDTO(isbn, "Some Book");
    }

    private void simulateSlowService() {
        try {
            long time = 3000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
