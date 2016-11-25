/*
Descripción:    Clase de inicio de la aplicación cliente.
Autor:          Carlos Ernesto Guevara Aguilar.
F. Creación:    25 de Noviembre de 2016.
F. Cambio:      25 de Noviembre de 2016.
                
*/
package com.apress.books.client;

import com.apress.books.dao.IBookDAO;
import com.apress.books.dao.mysql.BookDAO;
import com.apress.books.model.Book;

/**
 * Clase de inicio de la aplicación cliente.
 * @author caguevar
 *
 */
public class BookApp {
	
	//#region Propiedades
	
	/**
	 * Acceso a la BD BOOKS.
	 */
	// private static BookDAO bookDAO = new BookDAO();
	
	//#endregion

	//#region Métodos
	
	/**
	 * Método de inicio de la aplicación.
	 * @param args Argumentos con que iniciará la aplicación.
	 */
	public static void main(String[] args) {
	
		System.err.println("Listing all Books:");
			
	} // public static void main(String[] args) {
	
	//#endregion 
	
} // public class BookApp {
