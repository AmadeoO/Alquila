package com.powersys.Alquila.models;


public class Propietario {
	private String nombre;
	private String apellido;
	private String dNI;
	private String telefono;
	private Direccion direccion;
	private SocialMedia socialMedia;
	private String cUIL;
	
	public Propietario(String nombre, String apellido, String dNI, String telefono, Direccion direccion,
			SocialMedia socialMedia, String cUIL) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dNI = dNI;
		this.telefono = telefono;
		this.direccion = direccion;
		this.socialMedia = socialMedia;
		this.cUIL = cUIL;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getdNI() {
		return dNI;
	}

	public void setdNI(String dNI) {
		this.dNI = dNI;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public SocialMedia getSocialMedia() {
		return socialMedia;
	}

	public void setSocialMedia(SocialMedia socialMedia) {
		this.socialMedia = socialMedia;
	}

	public String getcUIL() {
		return cUIL;
	}

	public void setcUIL(String cUIL) {
		this.cUIL = cUIL;
	}
	
	
}
