package com.xadmin.SpringBootCrud.bean;

import jakarta.persistence.Entity;


import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Subject")

public class Subject {
	
	@Id
	private String BookId;
	private String BookTitle;
	private String BookAuthor;
	private String Authorid;
	
	public Subject() {
		super();
	}
	public Subject(String bookId, String bookTitle, String bookAuthor) {
		super();
		BookId = bookId;
		BookTitle = bookTitle;
		BookAuthor = bookAuthor;
    }
	public String getBookId() {
		return BookId;
	}
	public void setBookId(String bookId) {
		BookId = bookId;
	}
	public String getBookTitle() {
		return BookTitle;
	}
	public void setBookTitle(String bookTitle) {
		BookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return BookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}
	public String getAuthorId() {
		return Authorid;
	}
	public void setAuthorId(String authorId) {
		Authorid = authorId;
	}

}
