package com.apress.books.model;

public class Author {

	private Long id;
	private Long bookId;
	private String firstName;
	private String lastName;
	
	public Long getId () {
		
		return (this.id);
	} // public Long getId () {
	
	public void setId (Long id) {
		
		this.id = id;
	} // public void setId (Long id) {
	
	public Long getBookId () {
		
		return (this.bookId);
	} // public Long getBookId () {
	
	public void setBookId (Long bookId) {
		
		this.bookId = bookId;
	} // public void setBookId (Long bookId) {
	
	public String getFirstName () {
		
		return (this.firstName);
	} // public String getFirstName () {
	
	public void setFirstName (String firstName) {
		
		this.firstName = firstName;
	} // public void setFirstName (String  firstName) {
	
	public String getLastName () {
		
		return (this.lastName);
	} // public String getLastName () {
	
	public void setLastName (String lastName) {
		
		this.lastName = lastName;
	} // public void setLastName (String lastName) {
	
	public String toString () {
		
		return ("Author - Id: " + id + ", Book id: " + bookId + ", First Name: " 
				+ this.firstName + ", Last Name: " + this.lastName);
	} // public String toString () {
} // public class Author {
