package com.powersys.Alquila.models;


public class SocialMedia {
	
	private String facebook;
	private String gmail;
	private String instagram;
	
	public SocialMedia(String facebook, String gmail, String instagram) {
		this.facebook = facebook;
		this.gmail = gmail;
		this.instagram = instagram;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public String getInstagram() {
		return instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}
	
	
}
