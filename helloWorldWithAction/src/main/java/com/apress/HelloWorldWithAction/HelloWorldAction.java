package com.apress.HelloWorldWithAction;

/*
 * Descripci�n:	Clase controladora del proyecto.
 * Autor:		Carlos Ernesto Guevara Aguilar.
 * F. Creaci�n:	8 de Diciembre de 2016.
 * F. Cambio:	11 de Diciembre de 2016.
 * Comentarios:	
 * 				11 de Diciembre de 2016.
 * 					Se continuó con la construcción de la clase dede MAC OS.
 * 
 */

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 * Clase controladora del proyecto.
 * @author caguevar
 *
 */
@Action(value="/hello", results = {@Result(name="success", location="/hello.jsp")})
public class HelloWorldAction {
	
	//#region Propiedades
	
	private String name;
	
	//#endregion
	
	//#region Métodos
	
	public String execute () throws Exception {
		
		return ("success");
	} // public String execute () throws Exception {
	
	public String getName () {
		
		return (this.name);
	} // public String getName () {
	
	public void setName (String name) {
		
		this.name = name;
	} // public void setName (String name) {
	
	//#endregion

} // public class HelloWorldAction {
