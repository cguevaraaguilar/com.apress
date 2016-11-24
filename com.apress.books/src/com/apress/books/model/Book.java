package com.apress.books.model;

import java.util.List;
import com.apress.books.model.Author;

public class Book {

	private Long id;
	private Long categoryId;
	private String bookTitle;
	private List<Author> authors;
	private String publisherName;
	
	public Long getId () {
		
		return (this.id);
	} // public Long getId () {
	
	public void setId (Long id) {
		
		this.id = id;
	} // public void setId (Long id) {
	
	public Long getCategoryId () {
		
		return (this.categoryId);
	} // public Long getCategoryId () {
	
	public void setCategoryId (Long categoryId) {
		
		this.categoryId = categoryId;
	} // public void setCategoryId (Long categoryId) {
	
	public String getBookTitle () {
		
		return (this.bookTitle);
	} // public String getBookTitle () {
	
	public void setBookdTitle(String bookTitle) {
		
		this.bookTitle = bookTitle;
	} // public void setBookdTitle(String bookTitle) {
	
	public List<Author> getAuthors () {
		
		return (this.authors);
	} // public List<Author> getAuthors () {
	
	public void setAuthors (List<Author> authors) {
		
		this.authors = authors;
	} // public void setAuthors (List<Author> authors) {
	
	public String getPublisherName () {
		
		return (this.publisherName);
	} // public String getPublisherName () {
	
	public void setPublisherName (String publisherName) {
		
		this.publisherName = publisherName;
	} // public void setPublisherName (String publisherName) {
	
	public String toString () {
		
		return ("Book - Id: " + this.id + ", Book Title: " + this.bookTitle);
	} // public String toString () {
} // public class Book {
