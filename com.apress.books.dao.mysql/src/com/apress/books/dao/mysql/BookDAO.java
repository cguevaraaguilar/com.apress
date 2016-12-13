/*
Descripcién:    Implementacién de la interface DAO para el acceso a datos de la BD BOOKS.
Autor:          Carlos Ernesto Guevara Aguilar.
F. Creacién:    25 de Noviembre de 2016.
F. Cambio:      12 de Diciembre de 2016.
Comentarios:
           		12 de Diciembre de 2016.
           			Se complementó la funcionalidad de DAO.
           			Se agregó isUserAllowed, findBooksByCategory
*/
package com.apress.books.dao.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.apress.books.dao.IBookDAO;
import com.apress.books.model.Author;
import com.apress.books.model.Book;
import com.apress.books.model.Category;
import com.apress.books.model.User;

/**
 * Clase de acceso a datos MySQL que implementa la interface IBookDAO.s
 * @author caguevar
 *
 */
public class BookDAO implements IBookDAO {
	
	//#region Propiedades
	
	/*
	 * Datos de conexión con la BD.
	 */
	private String msConnectionString;
	private String msUser;
	private String msPassword;
	
	//#endregion
	
	//#region Constructor
	
	/**
	 * Constructor de la clase.
	 * @param vsConnectionString Cadena de conexión.
	 * @param vsUser Usuario de la BD.
	 * @param vsPassword Password de la BD.
	 */
	public BookDAO (String vsConnectionString, String vsUser, String vsPassword) {
		
		msConnectionString = vsConnectionString;
		msUser = vsUser;
		msPassword = vsPassword;
	} // public BookDAO (String vsConnectionString, String vsUser, String vsPassword) {
	
	/**
	 * Comprobacién de existencia del driver jdbc.
	 */
	static {
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException ex) {
				System.err.println ("com.mysql.jdbc.Driver not found. " + ex.getMessage());
			} // try {
		} // static {

	//#endregion

	//#region Métodos
	
	/**
	 * Método que obtiene la conexién activa.
	 * @return La conexién activa.
	 * @throws SQLException Si error al obtener la conexién activa.
	 */
	private Connection getConnection () throws SQLException {
		
		return (
				DriverManager.getConnection(msConnectionString, msUser, msPassword)
				);
	} // private Connection getConnection () throws SQLException {
	
	/**
	 * Método que cierra la conexién indicada.
	 * @param connection La conexién a cerrar.
	 */
	private void closeConnection (Connection connection) {
		
		if (connection == null) {
			return;
		} // if (connection == null) {
		
		try {
			
			connection.close ();
		} catch (SQLException ex) {
		} // try {
	} // private void closeConnection (Connection connection) {
	
	/**
	 * Método que obtiene todos los libros.
	 */
	public List <Book> findAllBooks () {
		
		List <Book> result = new ArrayList <> ();
		List <Author> authorList = new ArrayList <>();
		
		String sql = "SELECT * FROM BOOK INNER JOIN AUTHOR ON BOOK.ID = AUTHOR.BOOK_ID;";
		
		Connection connection = null;
		
		try {
			
			connection = getConnection ();
			
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			
			while (resultSet.next()) {
				
				Book book = new Book ();
				Author author = new Author ();
				
				book.setId(resultSet.getLong("ID"));
				book.setBookdTitle(resultSet.getString("BOOK_TITLE"));
				book.setCategoryId(resultSet.getLong("CATEGORY_ID"));
				
				author.setBookId(resultSet.getLong("BOOK_ID"));
				author.setFirstName(resultSet.getString("FIRST_NAME"));
				author.setLastName(resultSet.getString("LAST_NAME"));
				
				authorList.add(author);
				
				book.setAuthors(authorList);
				book.setPublisherName(resultSet.getString("PUBLISHER"));
				
				result.add(book);
			} // while (resultSet.next()) {
		} catch (SQLException ex) {
			
			ex.printStackTrace();
		} finally {
			
			closeConnection (connection);
		} // try {
		
		return (result);
	} // public List <Book> findAllBooks () {

	/**
	 * Método que obtiene todos los libros por similitud en nombre de libro, nombre de autor o apellido de autor.
	 */
	public List <Book> searchBooksByKeyword(String keyWord) {
		
		List <Book> result = new ArrayList <>();
		List <Author> authorList = new ArrayList <>();
		
		String sql = "SELECT * FROM BOOK INNER JOIN AUTHOR ON BOOK.ID = AUTHOR.BOOK_ID"
				+ " WHERE BOOK_TITLE LIKE '%"
				+ keyWord.toUpperCase().trim()
				+ "%'"
				+ " OR FIRST_NAME LIKE '%"
				+ keyWord.toUpperCase().trim()
				+ "%'"
				+ " OR LAST_NAME LIKE '%" 
				+ keyWord.toUpperCase().trim()
				+ "%';"
				;
		
		Connection connection = null;
		
		try {
			
			connection = getConnection ();
			
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			
			while (resultSet.next()) {
				
				Book book = new Book ();
				Author author = new Author ();
				
				book.setId(resultSet.getLong("ID"));
				book.setBookdTitle(resultSet.getString("BOOK_TITLE"));
				book.setCategoryId(resultSet.getLong("CATEGORY_ID"));
				
				author.setBookId(resultSet.getLong("BOOK_ID"));
				author.setFirstName(resultSet.getString("FIRST_NAME"));
				author.setLastName(resultSet.getString("LAST_NAME"));
				
				authorList.add(author);
				
				book.setAuthors(authorList);
				book.setPublisherName(resultSet.getString("PUBLISHER"));
				
				result.add(book);
			} // while (resultSet.next()) {
		} catch (SQLException ex) {
			
			ex.printStackTrace();
		} finally {
			
			closeConnection (connection);
		} // try {
		
		return (result);
	} // public List <Book> searchBooksByKeyword(String keyWord) {
	
	/**
	 * Método que obtiene todas las categoréas.
	 */
	public List <Category> findAllCategories () {
		
		List <Category> result = new ArrayList <>();
		
		String sql = "SELECT * FROM CATEGORY;";
		
		Connection connection = null;
		
		try {
			
			connection = getConnection ();
			
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			
			while (resultSet.next()) {
				
				Category category = new Category ();
				
				category.setId(resultSet.getLong("ID"));
				category.setCategoryDescription(resultSet.getString("CATEGORY_DESCRIPTION"));
				
				result.add(category);
			} // while (resultSet.next()) {
		} catch (SQLException ex) {
			
			ex.printStackTrace();
		} finally {
			
			closeConnection (connection);
		} // try {
		
		return (result);
	} // public List <Category> findAllCategories () {
	
	/**
	 * Método que inserta un libro.
	 */
	public void insert (Book book) {
		
	} // public void insert (Book book) {
	
	/**
	 * Método que actualiza los datos de un libro.
	 */
	public void update (Book book) {
		
	} // public void update (Book book) {
	
	/**
	 * Método que borra un libro.
	 */
	public void delete (Long bookId) {
		
	} // public void delete (Long bookId) {
	
	/**
	 * Método que verifica si el usuario es válido en la aplicación.
	 * @param user
	 * @return
	 */
	public boolean isUserAllowed (User user) {
		
		String sql = "SELECT * FROM USER WHERE USERNAME = ? AND PASSWORD = ?;";
		
		Connection connection = null;
		boolean valid = false;
		
		try {
			
			connection = getConnection ();
			PreparedStatement statement = connection.prepareStatement(sql);
			
			statement.clearParameters();
			statement.setString(1, user.getUserName());
			statement.setString(2, user.getPassword());
			
			ResultSet resultset = statement.executeQuery();
			
			if (resultset.next ()) {
				
				valid = true;
			} // if (resultset.next ()) {
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			
		} // try {
		
		return (valid);
	} // public boolean isUserAllowed (User user) {
	
	public ArrayList <Book> findBooksByCategory (int categoryId) {
		
		ArrayList <Book> bookList = new ArrayList <Book> ();
		List <Author> authorList = new ArrayList <> ();
		String sql = "SELECT * FROM BOOK INNER JOIN AUTHOR ON BOOK.ID = AUTHOR.BOOK_ID WHERE CATEGORY_ID = ?;";
		
		Connection connection = null;
		
		try {
			
			connection = getConnection ();
			PreparedStatement statement = connection.prepareStatement(sql);
			
			statement.clearParameters ();
			statement.setInt(1, categoryId);
			
			ResultSet resultset = statement.executeQuery ();
			
			while (resultset.next ()) {
				
				Book book = new Book ();
				Author author = new Author ();
				
				book.setId(resultset.getLong("ID"));
				book.setBookdTitle(resultset.getString("BOOK_TITLE"));
				book.setCategoryId(resultset.getLong("CATEGORY_ID"));
				
				author.setBookId((book.getId());
				author
				
			} // while (resultset.next ()) {
		} catch (SQLException e) {
			
		} finally {
			
		} // try {
	} // public ArrayList <Book> findBooksByCategory (int categoryId) {
	
	//#endregion
	
} // public class BookDAO implements IBookDAO {
