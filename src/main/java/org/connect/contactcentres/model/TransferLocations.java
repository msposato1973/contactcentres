package org.connect.contactcentres.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class  TransferLocations {
	          
	private List<TransferType> transferType;
	
	public TransferLocations() {}  
	public TransferLocations(List<TransferType> transferType) {
		super();  
	    this.transferType = transferType;
	}

	@XmlElement
	public List<TransferType> getTransferType() {
		return transferType;
	}

	public void setTransferType(List<TransferType> transferType) {
		this.transferType = transferType;
	}
}
