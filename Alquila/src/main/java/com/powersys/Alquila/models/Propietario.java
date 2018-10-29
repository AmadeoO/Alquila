package com.powersys.Alquila.models;


public class Propietario {
	private String nombre;
	private String apellido;
	private String dni;
	private String telefono;
	private Direccion direccion;
	private String email;
	private SocialMedia socialMedia;
	private String cuil;
	private String fotoPerfil;//ruta del archivo de la imagen

	public Propietario(String nombre, String apellido, String dni, String telefono, Direccion direccion, String email,
			SocialMedia socialMedia, String cuil, String fotoPerfil) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono = telefono;
		this.direccion = direccion;
		this.email = email;
		this.socialMedia = socialMedia;
		this.cuil = cuil;
		this.fotoPerfil = fotoPerfil;
	}



	public String getFotoPerfil() {
		return fotoPerfil;
	}



	public void setFotoPerfil(String fotoPerfil) {
		this.fotoPerfil = fotoPerfil;
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}
