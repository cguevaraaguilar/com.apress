/*
Descripcién:    Clase de inicio de la aplicacién cliente.
Autor:          Carlos Ernesto Guevara Aguilar.
F. Creacién:    25 de Noviembre de 2016.
F. Cambio:      27 de Noviembre de 2016.
				27 de Noviembre de 2016.
					Se continuó desarrollo desde MACBOOK.
                
*/
package com.apress.books.client;

import java.util.List;

import com.apress.books.dao.IBookDAO;
import com.apress.books.dao.mysql.BookDAO;
import com.apress.books.model.Book;

/**
 * Clase de inicio de la aplicacién cliente.
 * 
 * @author caguevar
 *
 */
public class BookApp {

	// #region Propiedades

	/**
	 * Acceso a la BD BOOKS.
	 */
	private static IBookDAO bookDAO = new BookDAO("jdbc:mysql://localhost:3306/books", "root", "b1ch052oo5A.");

	// #endregion

	// #region Métodos

	/**
	 * Método de inicio de la aplicacién.
	 * 
	 * @param args
	 *            Argumentos con que iniciaré la aplicacién.
	 */
	public static void main(String[] args) {

		// List all books
		System.err.println("Listing all Books:");
		findAllBooks ();
		
		System.out.println();
		
		//Search book by keyword
		System.err.println("Search book by keyword in book title: Grovy:");
		
		searchBooks ("Groovy");
		System.out.println();
		
		System.err.println("Search book by keyword in book author's name: Josh:");
		
		searchBooks("Josh");
	} // public static void main(String[] args) {

	/**
	 * Método que obtiene todos los libros.
	 */
	private static void findAllBooks () {
		
		List <Book> books = bookDAO.findAllBooks();
		
		for (Book book : books) {
			
			System.out.println(book);
		} // for (Book book : books) {
	} // private static void findAllBooks () {
	
	/**
	 * Método que obtiene libros por similitud
	 * @param keyword Similitud por la cual buscar.
	 */
	private static void searchBooks (String keyword) {
		
		List <Book> books = bookDAO.searchBooksByKeyword(keyword);
		
		for (Book book : books) {
			System.out.println(book);
		} // for (Book book : books) {
	} // private static void searchBooks (String keyword) {
	// #endregion

} // public class BookApp {