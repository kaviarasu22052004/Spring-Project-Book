package com.hexaware.Book.Mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.hexaware.Book.DTO.BookDTO;
import com.hexaware.Book.Entity.Book;

@Component
public class BookMapper {

    @Autowired
    ModelMapper modelMapper;
    
    public BookDTO entityToDTO(Book book) {
        return modelMapper.map(book, BookDTO.class);
    }

    public Book dtoToEntity(BookDTO bookDTO) {
        return modelMapper.map(bookDTO, Book.class);
    }

}
