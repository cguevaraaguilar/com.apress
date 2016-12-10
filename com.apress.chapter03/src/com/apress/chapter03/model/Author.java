package com.apress.chapter03.model;

/*
 * Descripción:	Entidad de negocio de la clase Autor.
 * Autor:		Carlos Ernesto Guevara Aguilar.
 * F. Creación:	5 de Diciembre de 2016.
 * F. Cambio:	5 de Diciembre de 2016.
 * Comentarios:	
 */

/**
 * Entidad de negocio de la clase Autor.
 * @author caguevar
 *
 */
public class Author {

	//#region Propiedades
	
	private String name;
	
	//#endregion
	
	//#region Métodos
	
	public String getName () {
		
		return (name);
	} // public String getName () {
	
	public void setName (String name) {
		
		this.name = name;
	} // public void setName (String name) {
	
	//#endregion
	
} // public class Author {
