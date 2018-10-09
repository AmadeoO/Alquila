package com.powersys.Alquila.models;


public class Altura {
	private int latitud;
	private int longitud;
	
	
	public Altura(int latitud, int longitud) {
		
		this.latitud = latitud;
		this.longitud = longitud;
	}
	public int getLatitud() {
		return latitud;
	}
	public void setLatitud(int latitud) {
		this.latitud = latitud;
	}
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}


}
