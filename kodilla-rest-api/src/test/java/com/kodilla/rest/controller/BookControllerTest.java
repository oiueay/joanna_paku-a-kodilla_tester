package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;


class BookControllerTest {

    @Test
    void shouldAddBook() {

        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);

        BookDto bookDto = new BookDto("Lord of the Rings", "J.R.R. Tolkien");

        bookController.addBook(bookDto);

        Mockito.verify(bookServiceMock, times(1)).addBook(bookDto);
    }
}

