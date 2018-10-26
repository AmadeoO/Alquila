package com.powersys.Alquila.models;


public class HorariosAtencion {
	private int dd;
	private int mm;
	private int aaaa;
	private int hs;
	private int min;
	private int seg;
	
	public HorariosAtencion(int dd, int mm, int aaaa, int hs, int min, int seg) {
		this.dd = dd;
		this.mm = mm;
		this.aaaa = aaaa;
		this.hs = hs;
		this.min = min;
		this.seg = seg;
	}

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getAaaa() {
		return aaaa;
	}

	public void setAaaa(int aaaa) {
		this.aaaa = aaaa;
	}

	public int getHs() {
		return hs;
	}

	public void setHs(int hs) {
		this.hs = hs;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getSeg() {
		return seg;
	}

	public void setSeg(int seg) {
		this.seg = seg;
	}
	
	
	
}
