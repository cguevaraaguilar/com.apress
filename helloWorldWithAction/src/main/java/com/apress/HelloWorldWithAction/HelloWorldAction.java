package com.apress.HelloWorldWithAction;

/*
 * Descripción:	Clase controladora del proyecto.
 * Autor:		Carlos Ernesto Guevara Aguilar.
 * F. Creación:	8 de Diciembre de 2016.
 * F. Cambio:	8 de Diciembre de 2016.
 * Comentarios:	
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

} // public class HelloWorldAction {
