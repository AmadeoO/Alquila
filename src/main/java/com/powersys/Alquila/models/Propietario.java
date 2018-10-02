package com.powersys.Alquila.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Propietario {
	private String nombre;
	private String apellido;
	private String dNI;
	private String telefono;
	private Direccion direccion;
	private SocialMedia socialMedia;
	private String cUIL;
	

}
