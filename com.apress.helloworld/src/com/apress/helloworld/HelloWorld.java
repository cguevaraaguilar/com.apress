package com.apress.helloworld;

/*
 *	Descripci�n:	Servlet que se configura por anotaciones.
 *	Autor:			Carlos Ernesto Guevara Aguilar.
 *	F. Creaci�n:	29 de Noviembre de 2016.
 *	F. Cambio:		29 de Noviembre de 2016. 
 */

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet que se configura por anotaciones.
 */
@WebServlet(description = "Servlet Hello World", urlPatterns = { "/helloworld" })
public class HelloWorld extends HttpServlet {
	
	//#region Propiedades
	
	private static final long serialVersionUID = 1L;
	
	//#endregion
	
	//#region M�todos
	
	/**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
        // TODO Auto-generated constructor stub
    } // public HelloWorld() {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out = response.getWriter ();
		
		out.println ("<h2>Hola Mundo!</h2>");
	} // protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	} // protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	//#endregin
    
} // public class HelloWorld extends HttpServlet {
