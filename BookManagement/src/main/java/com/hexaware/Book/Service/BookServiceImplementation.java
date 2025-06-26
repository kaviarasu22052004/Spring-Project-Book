package com.hexaware.Book.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.Book.DTO.BookDTO;
import com.hexaware.Book.Entity.Book;
import com.hexaware.Book.Exception.BookNotFoundException;
import com.hexaware.Book.Mapper.BookMapper;
import com.hexaware.Book.Repository.BookRepository;

@Service
public class BookServiceImplementation implements BookService {
	

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookMapper bookMapper;

    
    @Override
    public BookDTO addBook(BookDTO bookDTO) {
        Book book = bookMapper.dtoToEntity(bookDTO);
        Book savedBook = bookRepository.save(book);
        return bookMapper.entityToDTO(savedBook);
    }

    @Override
    public BookDTO getBookByIsbn(String isbn) {
        Book book = bookRepository.findById(isbn)
        		.orElseThrow(() -> new BookNotFoundException("Book not found with ISBN: " + isbn));
        return bookMapper.entityToDTO(book);
    }


    @Override
    public BookDTO updateBook(String isbn, BookDTO bookDTO) {
        Book existingBook = bookRepository.findById(isbn)
        		.orElseThrow(() -> new BookNotFoundException("Book not found with ISBN: " + isbn));

        existingBook.setTitle(bookDTO.getTitle());
        existingBook.setAuthor(bookDTO.getAuthor());
        existingBook.setPublicationYear(bookDTO.getPublicationYear());

        Book updatedBook = bookRepository.save(existingBook);
        return bookMapper.entityToDTO(updatedBook);
    }

    @Override
    public void deleteBook(String isbn) {
        Book book = bookRepository.findById(isbn)
        		.orElseThrow(() -> new BookNotFoundException("Book not found with ISBN: " + isbn));
        bookRepository.delete(book);
    }

    @Override
    public List<BookDTO> getAllBooks() {
        List<Book> bookList = bookRepository.findAll();
        List<BookDTO> dtoList = new ArrayList<>();

        for (Book book : bookList) {
            BookDTO dto = bookMapper.entityToDTO(book);
            dtoList.add(dto);
        }

        return dtoList;
    }
}
