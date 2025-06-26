package com.hexaware.Book.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class BookDTO {
	
	@NotBlank(message = "ISBN is mandatory")
	String isbn;
    
    @NotBlank(message = "Title is mandatory")
    String title;

    @NotBlank(message = "Author is mandatory")
    String author;
    
    @NotNull(message = "Publication year must not be null")
    int publicationYear;

    
    
    
	public String getIsbn() {
		return isbn;
	}




	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}




	public String getTitle() {
		return title;
	}




	public void setTitle(String title) {
		this.title = title;
	}




	public String getAuthor() {
		return author;
	}




	public void setAuthor(String author) {
		this.author = author;
	}




	public int getPublicationYear() {
		return publicationYear;
	}




	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}




	public BookDTO() {

	}




	public BookDTO(@NotBlank(message = "ISBN is mandatory") String isbn,
			@NotBlank(message = "Title is mandatory") String title,
			@NotBlank(message = "Author is mandatory") String author,
			@NotNull(message = "Publication year must not be null") int publicationYear) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
	}




	@Override
	public String toString() {
		return "BookDTO [isbn=" + isbn + ", title=" + title + ", author=" + author + ", publicationYear="
				+ publicationYear + "]";
	}
    
	
    

}
