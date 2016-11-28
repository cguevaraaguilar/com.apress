package helloworld;

/*
 * Descripción:	Servlet demo.
 * Autor:		Carlos Ernesto Guevara Aguilar.
 * F. Creación:	28 de Noviembre de 2016.
 * F. Cambio:	28 de Noviembre de 2016.
 * 
 */

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet demo.
 * @author caguevar
 *
 */
public class HelloWorld extends HttpServlet {

	//#region Métodos
	
	/**
	 * Método que responde al evento GET.
	 */
	protected void doGet (HttpServletRequest request, HttpServletResponse response) {
		
		try  {
			
			response.setContentType("text/html");
			
			PrintWriter printWriter = response.getWriter();
			
			printWriter.println("<h2>");
			printWriter.println("Hola mundo");
			printWriter.println("</h2>");
		} catch (IOException ex) {
			
		} // try  {
	} // protected void doGet (HttpServletRequest request, HttpServletResponse response) {
	
	//#endregion 
	
} // public class HelloWorld extends HttpServlet {
