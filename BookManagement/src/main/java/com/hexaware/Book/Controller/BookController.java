package com.hexaware.Book.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.Book.DTO.BookDTO;
import com.hexaware.Book.Service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {
	
	 @Autowired
	 BookService bookService;

	 
	    @PostMapping("/addbook")
	    public BookDTO addBook(@Validated @RequestBody BookDTO bookDTO) {
	        return bookService.addBook(bookDTO);
	    }


	    @GetMapping("/getbyid/{isbn}")
	    public BookDTO getBookByIsbn(@PathVariable String isbn) {
	        return bookService.getBookByIsbn(isbn);
	    }

	    @PutMapping("/update/{isbn}")
	    public BookDTO updateBook(@PathVariable String isbn, @Validated @RequestBody BookDTO bookDTO) {
	        return bookService.updateBook(isbn, bookDTO);
	    }


	    @GetMapping("/allbooks")
	    public List<BookDTO> getAllBooks() {
	        return bookService.getAllBooks();
	    }
	    
	    
	    @DeleteMapping("/delete/{isbn}")
	    public String deleteBook(@PathVariable String isbn) {
	        bookService.deleteBook(isbn);
	        return "Book deleted successfully";
	    }

}
