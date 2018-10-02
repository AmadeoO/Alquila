package com.powersys.Alquila.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Direccion {
	private String altura;
	private String calle;
	private String barrio;
	private String parcela;
	
}
