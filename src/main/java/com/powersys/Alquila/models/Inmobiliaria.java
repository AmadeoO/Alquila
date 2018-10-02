package com.powersys.Alquila.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Inmobiliaria {
	private String nombre;
	private Direccion direccion;
	private String telefono;
	private SocialMedia social;
	private String razonSocial;
	private String cUIT;

}
