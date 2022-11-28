package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

class BookControllerTest {

    @Test
    void shouldAddBook() {

        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);

        BookDto book = new BookDto("Lord of the Rings", "J.R.R. Tolkien");

        Mockito.when(bookServiceMock.addBook().thenReturn(book));

        bookController.addBook(book);
        verify(bookController).addBook(book);

    }
}

