package com.hexaware.Book.Service;

import java.util.List;

import com.hexaware.Book.DTO.BookDTO;

public interface BookService {
	
	BookDTO addBook(BookDTO bookDTO);
    List<BookDTO> getAllBooks();
    BookDTO getBookByIsbn(String isbn);
    BookDTO updateBook(String isbn, BookDTO bookDTO);
    void deleteBook(String isbn);

}
