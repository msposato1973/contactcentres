package org.connect.contactcentres.service;

 

import java.util.List;

import javax.xml.bind.JAXBException;
import org.connect.contactcentres.model.TransferLocations;
import org.connect.contactcentres.model.TransferType;



public interface IServiceFactory {

	TransferLocations convertXmlToObject(String xmlString) throws JAXBException ;
	
	String convertObjectToXml(TransferLocations transferLocations) throws JAXBException;
	
	List<TransferType> getTransferTypeByName(String name) throws JAXBException;
	
	void callTransferCalculatedDistribution(String name) throws JAXBException;
	
}
