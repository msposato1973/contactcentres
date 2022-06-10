package org.connect.contactcentres.service;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.connect.contactcentres.model.TransferLocations;
import org.connect.contactcentres.model.TransferType;
import org.connect.contactcentres.utility.SingletonCalculatedDistribution;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ServiceFactory implements IServiceFactory {
	
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ServiceFactory.class);
	private SingletonCalculatedDistribution instanceOne ;
	/**
	 *
	 */
	@Override
	public TransferLocations convertXmlToObject(String xmlString) throws JAXBException {
		// TODO Auto-generated method stub
	
		log.info("Into convertXmlToObject - ServiceFactory");
		log.info("Into xmlString", xmlString);
				
		instanceOne = SingletonCalculatedDistribution.getInstance();
		 
		// Convert XML back to TransferLocations Model
        JAXBContext jaxbContext = JAXBContext.newInstance(TransferLocations.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        TransferLocations transferLocations = (TransferLocations) jaxbUnmarshaller.unmarshal(new StringReader(xmlString));  
  
        System.out.println(transferLocations);
        log.info("Into transferLocations", transferLocations.toString());
        log.info("End convertXmlToObject - ServiceFactory");
        
       
        instanceOne.setTransferLocationsInstance(transferLocations);
        instanceOne.setMapInventory(searchTransferType(transferLocations));
        
		log.info("End convertObjectToXml - ServiceFactory :" + searchTransferType(transferLocations));
		return transferLocations;
	}

	@Override
	public String convertObjectToXml(TransferLocations transferLocations) throws JAXBException {
		log.info("Into convertObjectToXml - ServiceFactory");
		// Convert the TransferLocations Model to XML
        JAXBContext jaxbContext = JAXBContext.newInstance(TransferLocations.class);
 
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
 
        StringWriter xmlWriter = new StringWriter();
        marshaller.marshal(transferLocations, xmlWriter);
        
    	log.info("Into xmlWriter", xmlWriter.toString());
        log.info("End convertObjectToXml - ServiceFactory");
		return xmlWriter.toString();
	}

	
	@Override
	public List<TransferType> getTransferTypeByName(String name) throws JAXBException {
		SingletonCalculatedDistribution.getInstance();
		return searchTransferType(name, SingletonCalculatedDistribution.getTransferLocationsInstance());
	}

	protected  List<TransferType> searchTransferType(String name, TransferLocations inventory) {
		return inventory.getTransferType().stream()                       
				.filter(x -> name.equalsIgnoreCase(x.getName()))
				.collect(Collectors.toList()
		); 
	}
	
	
	protected  Map<String, List<TransferType>> searchTransferType(TransferLocations inventory) {
		return inventory.getTransferType().stream().collect(Collectors.groupingBy(TransferType::getName) );
	}

	@Override
	public void callTransferCalculatedDistribution(String name) throws JAXBException {
		// TODO Auto-generated method stub
		SingletonCalculatedDistribution.getInstance();	
	}
	
	 
}
