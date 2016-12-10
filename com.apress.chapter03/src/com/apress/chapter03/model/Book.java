package com.apress.chapter03.model;

/*
 * Descripción:	Entidad de negocio que representa un Libro.
 * Autor:		Carlos Ernesto Guevara Aguilar.
 * F. Creación:	5 de Diciembre de 2016.
 * F. Cambio:	5 de Diciembre de 2016.
 * Comentarios:	
 */

/**
 * Entidad de negocio que representa un Libro.
 * @author caguevar
 *
 */
public class Book {

	//#region Propiedades
	
	private String bookTitle;
	private Author author;
	
	//#endregion 
	
	//#region Métodos
	
	public String getBookTitle ()
	{
		return (this.bookTitle);
	} // public String getBookTitle ()
	
	public void setBookTitle (String bookTitle) {
		
		this.bookTitle = bookTitle;
	} // public void setBookTitle (String bookTitle) {
	
	public Author getAuthor () {
		
		return (author);
	} // public Author getAuthor () {
	
	public void setAuthor (Author author) {
		
		this.author = author;
	} // public void setAuthor (Author author) {
	
	//#endregion
	
} // public class Book {
