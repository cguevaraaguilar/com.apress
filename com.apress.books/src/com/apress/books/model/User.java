package com.apress.books.model;

/*
 * Descripción:	Clase que representa el modelo de la entidad User.
 * Autor:		Carlos Ernesto Guevara Aguilar.
 * F. Creación:	12 de Diciembre de 2016.
 * F. Cambio:	12 de Diciembre de 2016.
 * Comentarios:	
 */

import java.util.Date;

/**
 * Clase que representa el modelo de la entidad User.
 * @author carlosernestoguevaraaguilar
 *
 */
public class User {
	
	//#region Propieades
	
	private long id;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	
	//#endregion 
	
	//#region Métodos
	
	public void setId (long id) {
		
		this.id = id;
	} // public void setId (long id) {
	
	public long getId () {
		
		return (this.id);
	} // public long getId () {
	
	public void setFirstName (String lastName) {
		
		this.lastName = lastName;
	} // public void setFirstName (String lastName) {
	
	public String getFirstName () {
		
		return (this.firstName);
	} // public String getFirstName () {
	
	public void setLastName (String lastName) {
		
		this.lastName = lastName;
	} // public void setLastName (String lastName) {
	
	public String getLastName () {
		
		return (this.lastName);
	} // public String getLastName () {
	
	public void setUserName (String userName) {
		
		this.userName = userName;
	} // public void setUserName (String userName) {
	
	public String getUserName () {
		
		return (this.userName);
	} // public String getUserName () {
	
	public void setPassword (String password) {
		
		this.password = password;
	} // public void setPassword (String password) {
	
	public String getPassword () {
		
		return (this.password);
	} // public String getPassword () {
	
	//#endregion

} // public class User {
