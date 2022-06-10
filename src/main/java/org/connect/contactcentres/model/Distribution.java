package org.connect.contactcentres.model;

public class Distribution {
	
	private String locationName ;
	private String appropriateTelephoneNumber ;
	private int weight;
	private int calculatedDistribution;
	private int dialBased ;
	
	public Distribution() {
		super();
	}
	
	public String getLocationName() {
		return locationName;
	}
	public String getAppropriateTelephoneNumber() {
		return appropriateTelephoneNumber;
	}
	public int getWeight() {
		return weight;
	}
	public int getCalculatedDistribution() {
		return calculatedDistribution;
	}
	public int getDialBased() {
		return dialBased;
	}
	 
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public void setAppropriateTelephoneNumber(String appropriateTelephoneNumber) {
		this.appropriateTelephoneNumber = appropriateTelephoneNumber;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setCalculatedDistribution(int calculatedDistribution) {
		this.calculatedDistribution = calculatedDistribution;
	}
	public void setDialBased(int dialBased) {
		this.dialBased = dialBased;
	}
	 

}
