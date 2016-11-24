package com.apress.books.model;

/**
 * Clase que representa la entidad Category
 * @author caguevar
 *
 */
public class Category {

	private Long id;
	private String categoryDescription;
	
	public Long getId () {
		
		return (this.id);
	} // public Long getId () {
	
	public void setId (Long id) {
		this.id = id;
	} // public void setId (Long id) {
	
	public String getCategoryDescription () {
		return (this.categoryDescription);
	} // public String getCategoryDescription () {
	
	public void setCategoryDescription (String categoryDescription) {
		this.categoryDescription = categoryDescription;
	} // public void setCategoryDescription (String categoryDescription) {
	
	public String toString () {
		return ("Category - Id: " + id + ", Category Description: " + categoryDescription);
	} // public String toString () {
} // public class Category {
