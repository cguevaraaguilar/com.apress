package com.apress.bookstore.action;

/*
 * Descripción:	Clase controladora que realiza las operaciones de autenticación del usuario.
 * Autor:		Carlos Ernesto Guevara Aguilar.
 * F. Creación:	11 de Diciembre de 2016.
 * F. Cambio:	11 de Diciembre de 2016.
 * Comentarios:	
 */

import com.opensymphony.xwork2.ActionSupport;

/**
 * Clase controladora que realiza las operaciones de autenticación del usuario.
 * @author cguevara_aguilar
 *
 */
public class LoginAction extends ActionSupport {
	
	//#region Propiedades
	
	static final long serialVersionUID = 1;
	
	private String username;
	private String password;
	
	//#endregion
	
	//#region Métodos
	
	public String execute () {
		
		if (this.username.equals ("carlos") && this.password.equals("password")) {
			
			return ("success");
			
		} else {
			
			addActionError (getText ("error.login"));
			
			return ("error");
		} // if (this.username.equals ("carlos") && this.password.equals("password")) {
	} // public String execute () {
	
	public String getUsername () {
		
		return (this.username);
	} // public String getUsername () {
	
	public void setUsername (String username) {
		
		this.username = username;
	} // public void setUsername (String username) {
	
	public String getPassword () {
		
		return (this.password);
	} // public String getPassword () {
	
	public void setPassword (String password) {
		
		this.password = password;
	} // public void setPassword (String password) {
	
	//#endregion

} // public class LoginAction extends ActionSupport {
