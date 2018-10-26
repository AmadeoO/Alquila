package com.powersys.Alquila.models;

public class DetallesLegales {
	
	private boolean garante;
	private boolean reciboSueldo;
	private boolean mesDeposito;
	private boolean espensas;
	private boolean mesAdelanto;
	
	public DetallesLegales(boolean garante, boolean reciboSueldo, boolean mesDeposito, boolean espensas,
			boolean mesAdelanto) {
		this.garante = garante;
		this.reciboSueldo = reciboSueldo;
		this.mesDeposito = mesDeposito;
		this.espensas = espensas;
		this.mesAdelanto = mesAdelanto;
	}

	public boolean isGarante() {
		return garante;
	}

	public void setGarante(boolean garante) {
		this.garante = garante;
	}

	public boolean isReciboSueldo() {
		return reciboSueldo;
	}

	public void setReciboSueldo(boolean reciboSueldo) {
		this.reciboSueldo = reciboSueldo;
	}

	public boolean isMesDeposito() {
		return mesDeposito;
	}

	public void setMesDeposito(boolean mesDeposito) {
		this.mesDeposito = mesDeposito;
	}

	public boolean isEspensas() {
		return espensas;
	}

	public void setEspensas(boolean espensas) {
		this.espensas = espensas;
	}

	public boolean isMesAdelanto() {
		return mesAdelanto;
	}

	public void setMesAdelanto(boolean mesAdelanto) {
		this.mesAdelanto = mesAdelanto;
	}
	
	
	

}
