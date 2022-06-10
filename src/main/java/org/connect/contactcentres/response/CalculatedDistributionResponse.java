package org.connect.contactcentres.response;

public class CalculatedDistributionResponse {
	
	private String appropriateTelephoneNumber ;
	private String locationName;
	private String numberPreviousCalls;
	
	public String getAppropriateTelephoneNumber() {
		return appropriateTelephoneNumber;
	}
	
	public CalculatedDistributionResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getLocationName() {
		return locationName;
	}
	
	public String getNumberPreviousCalls() {
		return numberPreviousCalls;
	}
	
	public void setAppropriateTelephoneNumber(String appropriateTelephoneNumber) {
		this.appropriateTelephoneNumber = appropriateTelephoneNumber;
	}
	
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	
	public void setNumberPreviousCalls(String numberPreviousCalls) {
		this.numberPreviousCalls = numberPreviousCalls;
	}
	
	public CalculatedDistributionResponse(String appropriateTelephoneNumber, String locationName, String numberPreviousCalls) {
		super();
		this.appropriateTelephoneNumber = appropriateTelephoneNumber;
		this.locationName = locationName;
		this.numberPreviousCalls = numberPreviousCalls;
	} 

	
}
