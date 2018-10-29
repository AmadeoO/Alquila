package com.powersys.Alquila.models;


public class Inmobiliaria {
	private String nombre;
	private Direccion direccion;
	private String telefono;
	private SocialMedia social;
	private String razonSocial;
	private String cUIT;
	
	
	public Inmobiliaria(String nombre, Direccion direccion, String telefono, SocialMedia social, String razonSocial,
			String cUIT) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.social = social;
		this.razonSocial = razonSocial;
		this.cUIT = cUIT;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Direccion getDireccion() {
		return direccion;
	}


	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public SocialMedia getSocial() {
		return social;
	}


	public void setSocial(SocialMedia social) {
		this.social = social;
	}


	public String getRazonSocial() {
		return razonSocial;
	}


	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}


	public String getcUIT() {
		return cUIT;
	}


	public void setcUIT(String cUIT) {
		this.cUIT = cUIT;
	}
	
	
	
}
