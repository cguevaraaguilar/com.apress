package com.apress.books.bookWeb.controller;

/*
 * Descripción:	Servlet que realiza las tareas de Controlador en el modelo MVC implementado.
 * Autor:		Carlos Ernesto Guevara Aguilar.
 * F. Creación:	29 de Noviembre de 2016.
 * F. Cambio:	29 de Noviembre de 2016.
 */

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.apress.books.dao.IBookDAO;
import com.apress.books.dao.mysql.BookDAO;
import com.apress.books.model.Category;

/**
 * Servlet que realiza las tareas de Controlador en el modelo MVC implementado.
 */
@WebServlet("/BookController")
public class BookController extends HttpServlet {
	
	// #region Propiedades
	
	private static final long serialVersionUID = 1L;
	
	// #endregion 
	
	// #region Métodos
	
	/**
	 * Método que inicializa el Servlet.
	 */
	public void init (ServletConfig config) throws ServletException {
		
		super.init(config);
		
		// Instancia el Objeto de acceso a datos.
		IBookDAO bookDAO = new BookDAO ("jdbc:mysql://localhost:3306/books", "root", "b1ch052oo5A.");
		
		// Obtiene el listado de categorías de la BD.
		List<Category> categoryList = bookDAO.findAllCategories();
		
		// Obtiene el contexto.
		ServletContext context = config.getServletContext();
		
		// Almancena en el contexto la colección de categorías.
		context.setAttribute("categoryList", categoryList);
	} // public void init (ServletConfig config) throws ServletException {
	
	/**
     * Constructor de la clase.
     */
    public BookController() {
        super();
    } // public BookController() {

	/**
	 * Al recibir la solicitud GET.
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// La procesa por el POST.
		doPost(request, response);
	} // protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	/**
	 * Al recibir la solicitud POST.
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String base = "/jsp";
		String url = base + "home.jsp";
		
		String action = request.getParameter("action");
		String category = request.getParameter("category");
		String keyWord = request.getParameter("keyWord");
		
		// Si se indicó alguna acción
		if (action != null) {
			
			switch (action) {
			
				case "allBooks":
					findAllBooks (request, response);
					url = base + "listOfBooks.jsp";
					break;
				case "category":
					findAllBooks (request, response);
					url = base + "category.jsp?category=" + category;
					break;
				case "search":
					searchBooks (request, response, keyWord);
					url = base + "searchResult.jsp";
					break;
			} // switch (action) {
		} // if (action != null) {
		
		RequestDispatcher requestDispatcher = getServletContext ().getRequestDispatcher (url);
		
		requestDispatcher.forward(request, response);
	} // protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	// #endregion
	
} // public class BookController extends HttpServlet {
