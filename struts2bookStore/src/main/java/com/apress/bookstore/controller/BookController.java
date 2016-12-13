package com.apress.bookstore.controller;

/*
 * Descripción:	Clase controladora de bookstore.
 * Autor:		Carlos Ernesto Guevara Aguilar.
 * F. Creación:	12 de Diciembre de 2016.
 * F. Cambio:	12 de Diciembre de 2016.
 * Comentarios:	
 */

import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.struts2.util.ServletContextAware;

import com.apress.books.dao.IBookDAO;
import com.apress.books.dao.mysql.BookDAO;
import com.apress.books.model.Book;
import com.apress.books.model.Category;
import com.apress.books.model.User;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Clase controladora de bookstore.
 * @author carlosernestoguevaraaguilar
 *
 */
public class BookController extends ActionSupport {
	
	//#region Propiedades
	
	private static final long serialVersionUID = 1L;
	private int category;
	private String keyword;
	private IBookDAO dao;
	private List<Book> bookList;
	private String username;
	private String password;
	private Map <String, Object> session;
	private User user;
	private List <Category> categoryList;
	private String imageUrl;
	
	//#endregion

	//#region Metodos
	
	public String login () {

		return ("login");
	} // public String login () {
	
	public String executelogin () {

		String executelogin = "failed";
		
		session = ActionContext.getContext ().getSession ();
		dao = new BookDAO("jdbc:mysql://localhost:3306/books", "root", "b1ch052oo5A.");
		user = new User ();
		user.setUserName(this.getUserName());
		user.setPassword(this.getPassword ());
		setUser (user);
		
		if (dao.isUserAll)
		
		return ("executelogin");
	} // public String executelogin () {
	
	public String error () {return null;}
	
	public String allBooks () {return null;}
	
	public String booksByCategory () {return null;}
	
	public String searchByKeyword () {return	 null;}
	
	public String home () {return null;}
	
	public String selectedBooks () {return null;}
	
	public String logout () {return null;}
	
	public String getUserName () {
		
		return (this.username);
	} // public String getUserName () {
	
	public void setUserName (String username) {
		
		this.username = username;
	} // public void setUserName (String username) {
	
	public String getPassword () {
		
		return (this.password);
	} // public String getPassword () {
	
	public void setPassword (String password) {
		
		this.password = password;
	} // public void setPassword (String password) {
	
	public User getUser () {
		
		return (this.user);
	} // public User getUser () {
	
	public void setUser (User user) {
		
		this.user = user;
	} // public void setUser (User user) {
	
	//#endregion
	
} // public class BookController extends ActionSupport {
