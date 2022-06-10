package org.connect.contactcentres.controller;


import java.util.List;

import org.connect.contactcentres.model.TransferLocations;
import org.connect.contactcentres.model.TransferType;
import org.connect.contactcentres.service.IFunctionalityService;
import org.connect.contactcentres.service.IServiceFactory;
import org.connect.contactcentres.utility.ReadFileIO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/contactCentreTransfer")
@Slf4j
public class ContactCentreTransferController {
	
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ContactCentreTransferController.class);

	@Autowired
	private IServiceFactory serviceFactory;
	
	@Autowired
	private IFunctionalityService functionalityService;
	
	@PostMapping("/")
	public TransferLocations currentLiveConfiguration() throws Exception {
		log.info("Into loadFileContents");
		return loadFileContents();
	}
	
	/**
	* Return a view of the service current live configuration.. 
	* <p>
	* When this applet attempts to draw the image on
	* the screen, the data will be loaded. 
	* relative to the current live configuration
	* 
	* @return  current live configuration
	*/
	TransferLocations loadFileContents() throws Exception {
		log.info("Into loadFileContents");
		serviceFactory.convertXmlToObject(
				ReadFileIO.loadTextResourceFileContents()
		);
		
		return functionalityService.getViewServiceCurrentLiveConfiguration();
	}
	
	@PostMapping("/metricsData")
	public List<?> transferMetricsData() throws Exception {
		log.info("Into transferMetricsData");
		return metricsData();
	}
		
	List<?> metricsData() throws Exception {
		log.info("Into loadFileContents");
		
		return functionalityService.transferMetricsData();
	}
	
	@GetMapping("/{name}")
    public List<?> incomingCall(@PathVariable("name") String name) throws Exception {
		log.info("Into saveTransferType");
		List<TransferType> transfer = serviceFactory.getTransferTypeByName(name);
		log.info("END saveTransferType");
		return transfer;
    }
	
	/**
	* Take a location name as input and enable / disable it from the calculated distribution.
	*
	* @param text  the text of the loctionName
	*/
	@GetMapping("/anableDisable/{loctionName}")
    public TransferLocations anableDisableForLocationName(@PathVariable("loctionName") String loctionName) throws Exception {
		log.info("Into anableDisableForLocationName");
		functionalityService.anableDisableForLocationName(loctionName);
		log.info("END anableDisableForLocationName");
		return anableDisableForLocationName();
    }
	
	 TransferLocations anableDisableForLocationName() throws Exception {
			log.info("Into/End anableDisableForLocationName");
			return functionalityService.getViewServiceCurrentLiveConfiguration();
	 }
	
	
	@PostMapping(value = "/saveTransferType")
    public String saveTransferType(@RequestBody TransferType transferType) throws Exception {
		log.info("Into saveTransferType");
		transferType.getName();
		serviceFactory.getTransferTypeByName(transferType.getName());
		
		log.info("END saveTransferType");
		return null;
    }
	
	 String transferType(TransferLocations transferLocations) throws Exception {
		log.info("Into saveTransferType");
		log.info("END saveTransferType");
		return serviceFactory.convertObjectToXml(transferLocations);
	 }
	 
		 
}