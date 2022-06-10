package org.connect.contactcentres.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;

public class Location implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Location() {}
	
	public Location(String name, String number, int weight, boolean enabled) {
		super();
		this.name = name;
		this.number = number;
		this.weight = weight;
		this.enabled = enabled;
	}
	
	private String name;
	private String number;
	private int weight;
	private boolean enabled;
	
	@XmlAttribute
	public String getName() {
		return name;
	}
	public String getNumber() {
		return number;
	}
	public int getWeight() {
		return weight;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
