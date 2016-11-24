package com.apress.books.dao.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.apress.books.dao.IBookDAO;
import com.apress.books.model.Author;
import com.apress.books.model.Book;
import com.apress.books.model.Category;

public class BookDAO implements IBookDAO {

	static {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException ex) {
			
		} // try {
	} // static {
	
	private Connection getConnection () throws SQLException {
		
		return (
				DriverManager.getConnection("jdbc:mysql://localhost:3306/books", "root", "password")
				);
	} // private Connection getConnection () throws SQLException {
	
	private void closeConnection (Connection connection) {
		
		if (connection == null) {
			return;
		} // if (connection == null) {
		
		try {
			
			connection.close ();
		} catch (SQLException ex) {
		} // try {
	} // private void closeConnection (Connection connection) {
	
	public List <Book> findAllBooks () {
		
		List <Book> result = new ArrayList <> ();
		List <Author> authorList = new ArrayList <>();
		
		String sql = "SELECT * FROM BOOK INNER JOIN AUTHOR ON BOOK.ID = AUTHOR.BOOK_ID;";
	} // public List <Book> findAllBooks () {
} // public class BookDAO implements IBookDAO {
