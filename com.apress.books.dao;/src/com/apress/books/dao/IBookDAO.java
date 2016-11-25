/*
Descripci�n:    Interface DAO para el acceso a datos de la BD BOOKS.
Autor:          Carlos Ernesto Guevara Aguilar.
F. Creaci�n:    25 de Noviembre de 2016.
F. Cambio:      25 de Noviembre de 2016.
                
*/
package com.apress.books.dao;

import java.util.List;

import com.apress.books.model.Book;
import com.apress.books.model.Category;

public interface IBookDAO {
	
	//#region M�todos a ser implementados
	
	/**
	 * M�todo que obtiene todos los libros.
	 */
	public List<Book> findAllBooks ();
	
	/**
	 * M�todo que obtiene todos los libros por similitud en nombre de libro, nombre de autor o apellido de autor.
	 */
	public List<Book> searchBooksByKeyword (String keyword);
	
	/**
	 * M�todo que obtiene todas las categor�as.
	 */
	public List<Category> findAllCategories ();
	
	/**
	 * M�todo que inserta un libro.
	 */
	public void insert (Book book);
	
	/**
	 * M�todo que actualiza los datos de un libro.
	 */
	public void update (Book book);
	
	/**
	 * M�todo que borra un libro.
	 */
	public void delete (Long bookId);
	
	//#endregion
} // public interface IBookDAO {
