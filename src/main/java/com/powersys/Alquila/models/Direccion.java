package com.powersys.Alquila.models;



public class Direccion {
	private String piso;
	private String calle;
	private String barrio;
	private String parcela;
	private String altura;
	private Geolocalizacion geolocalizacion;
	
	public Direccion(String piso, String calle, String barrio, String parcela, String altura,
			Geolocalizacion geolocalizacion) {
		this.piso = piso;
		this.calle = calle;
		this.barrio = barrio;
		this.parcela = parcela;
		this.altura = altura;
		this.geolocalizacion = geolocalizacion;
	}

	public String getPiso() {
		return piso;
	}

	public void setPiso(String piso) {
		this.piso = piso;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	public String getParcela() {
		return parcela;
	}

	public void setParcela(String parcela) {
		this.parcela = parcela;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public Geolocalizacion getGeolocalizacion() {
		return geolocalizacion;
	}

	public void setGeolocalizacion(Geolocalizacion geolocalizacion) {
		this.geolocalizacion = geolocalizacion;
	}

	
}
	
	