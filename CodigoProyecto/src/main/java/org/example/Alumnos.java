package org.example;
//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Alumnos.java
//  @ Date : 03/05/2022
//  @ Author : 
//
//




public class Alumnos extends Observadores {
	private String numMatricula;
	public void Alumnos(String numMatricula) {
		this.numMatricula=numMatricula;
	}
	
	public void setNumeroMatricula(String numero) {
		this.numMatricula=numero;
	}
	
	public String getNumeroMatricula() {
		return numMatricula;
	}
	
	public void destroy() {
	
	}
}
