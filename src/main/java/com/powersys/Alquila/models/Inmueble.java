package com.powersys.Alquila.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author amadeo.fgarciagamil.com
 *
 */

@Entity(name="Inmueble")
@Table(name="inmueble")
public class Inmueble implements Serializable{

	
	
	/**
	 este atributo es unico para cada clase, es para relacionarlo univocamente a cada clase
	 */
	private static final long serialVersionUID = 5702863762836815934L;

	@Id
	@Column(name="id_inmueble")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String idInmueble;
	
	@Column(name="direccion")// ver como lo configuro despues
	private Direccion direccion;
	
	@Column(name="detalles_legales")
	private String detallesLegales;//Esta clase la va hacer Nico
	
	@Column(name="detalles_inmueble")
	private String detallesInmueble;//Esta clase la va hacer nico
	
	@Column(name="precio")
	private float precio;
	
	@Column(name="otros_detalles")
	private String otrosDetalles;
	
	@Column(name="tipo_inmueble")
	private String tipoInmueble; //Ej: Casa, Departamento, Oficina, etc.
	
	public Inmueble(Direccion direccion, String detallesLegales, String detallesInmueble, float precio,
			String otrosDetalles) {
		this.direccion = direccion;
		this.detallesLegales = detallesLegales;
		this.detallesInmueble = detallesInmueble;
		this.precio = precio;
		this.otrosDetalles = otrosDetalles;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public String getDetallesLegales() {
		return detallesLegales;
	}

	public void setDetallesLegales(String detallesLegales) {
		this.detallesLegales = detallesLegales;
	}

	public String getDetallesInmueble() {
		return detallesInmueble;
	}

	public void setDetallesInmueble(String detallesInmueble) {
		this.detallesInmueble = detallesInmueble;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getOtrosDetalles() {
		return otrosDetalles;
	}

	public void setOtrosDetalles(String otrosDetalles) {
		this.otrosDetalles = otrosDetalles;
	}

	public String getTipoInmueble() {
		return tipoInmueble;
	}

	public void setTipoInmueble(String tipoInmueble) {
		this.tipoInmueble = tipoInmueble;
	}
	
	
	
	
	

}
