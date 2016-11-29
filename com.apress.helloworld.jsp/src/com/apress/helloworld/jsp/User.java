package com.apress.helloworld.jsp;

/*
 * Descripción:	Bean que representa un usuario.
 * Autor:		Carlos Ernesto Guevara Aguilar.
 * F. Creación:	29 de Noviembre de 2016.
 * F. Cambio:	29 de Noviembre de 2016.
 */

/**
 * Bean que representa un usuario.
 * @author caguevar
 *
 */
public class User {

	// #region Propiedades
	
	private String name;
	
	// #endregion
	
	// #region Métodos
	
	/**
	 * Método que obtiene el nombre.
	 * @return El nombre del usuario.
	 */
	public String getName () {
		
		return (name);
	} // public String getName () {
	
	public void setName (String name) {
		
		this.name = name;
	} // public void setName (String name) {
	
	// #endregion
	
} // public class User {
