package org.connect.contactcentres.model;

import java.util.ArrayList;
import java.util.List;


public class TransferType {
	
	private String name;
	private List<Location> location;
	
	public TransferType(String name, List<Location> location) {
	    super();  
	    this.name = name;  
	    this.location = location;  
	}  
	
	public TransferType() {        
        location = new ArrayList<>();
    }
	
	public String getName() {
		return name;
	}
	
	public List<Location> getLocation() {
		return location;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setLocation(List<Location> location) {
		this.location = location;
	}

}
