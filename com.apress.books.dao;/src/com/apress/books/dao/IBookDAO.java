package com.apress.books.dao;

/*
Descripcién:    Interface DAO para el acceso a datos de la BD BOOKS.
Autor:          Carlos Ernesto Guevara Aguilar.
F. Creacién:    25 de Noviembre de 2016.
F. Cambio:      25 de Noviembre de 2016.
                
*/

import java.util.List;

import com.apress.books.model.Book;
import com.apress.books.model.Category;

public interface IBookDAO {
	
	//#region Métodos a ser implementados

	/**
	 * Método que obtiene todos los libros.
	 */
	public List<Book> findAllBooks ();
	
	/**
	 * Método que obtiene todos los libros por similitud en nombre de libro, nombre de autor o apellido de autor.
	 */
	public List<Book> searchBooksByKeyword (String keyword);
	
	/**
	 * Método que obtiene todas las categoréas.
	 */
	public List<Category> findAllCategories ();
	
	/**
	 * Método que inserta un libro.
	 */
	public void insert (Book book);
	
	/**
	 * Método que actualiza los datos de un libro.
	 */
	public void update (Book book);
	
	/**
	 * Método que borra un libro.
	 */
	public void delete (Long bookId);
	
	//#endregion
	
} // public interface IBookDAO {
