package com.apress.chapter03.controller;

/*
 * Descripción:	Controlador de Book Store.
 * Autor:		Carlos Ernesto Guevara Aguilar.
 * F. Creación:	5 de Diciembre de 2016.
 * F. Cambio:	5 de Diciembre de 2016.
 * Comentarios:	
 */

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;

import com.apress.chapter03.model.Author;
import com.apress.chapter03.model.Book;

/**
 * Controlador de Book Store.
 * @author caguevar
 *
 */
public class BookController extends HttpServlet {

	//#region Métodos
	
	protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Crea la entidad de negocio book para almacenarla como atributo
		Book book = new Book ();
		book.setBookTitle ("Learning Java Web");
		Author author = new Author ();
		author.setName("Vishal Layka");
		book.setAuthor(author);
		
		// Almancena el objeto libro como atributo
		request.setAttribute("bookAttrib", book);
		
		// Crea una cookie
		String userName = "carlos";
		Cookie c = new Cookie ("userName", userName);
		c.setPath("/");
		
		// Almacena la cookie en el response.
		response.addCookie(c);
		
		// Crea una BE book para almacenarla como session.
		HttpSession session = request.getSession();
		Book bookSession = new Book();
		bookSession.setBookTitle("Beginning Java");
		session.setAttribute("book", bookSession);
		
		// Inidica que página será la vista
		RequestDispatcher view = request.getRequestDispatcher("/book.jsp");
		view.forward(request, response);
		
	} // protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	//#endregion
	
} // public class BookController extends HttpServlet {
