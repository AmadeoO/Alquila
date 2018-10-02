package com.powersys.Alquila.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class HorariosAtencion {
	private int dd;
	private int mm;
	private int aaaa;
	private int hs;
	private int min;
	private int seg;
	
}
