package com.AdvanceLibraryManagementSystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BookData {

	@Column(name = "BookName")
	private String bookName;
	@Column(name = "Auther")
	private String bookAutherName;
	@Column(name = "Publisher")
	private String bookPublisherName;
	@Column(name = "ISBN")
	private Long isbn;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAutherName() {
		return bookAutherName;
	}

	public void setBookAutherName(String bookAutherName) {
		this.bookAutherName = bookAutherName;
	}

	public String getBookPublisherName() {
		return bookPublisherName;
	}

	public void setBookPublisherName(String bookPublisherName) {
		this.bookPublisherName = bookPublisherName;
	}

	public Long getIsbn() {
		return isbn;
	}

	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
