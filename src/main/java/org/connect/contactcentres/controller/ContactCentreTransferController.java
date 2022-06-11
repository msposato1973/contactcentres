package org.connect.contactcentres.controller;


import java.util.List;

import org.connect.contactcentres.model.TransferLocations;
import org.connect.contactcentres.model.TransferType;
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
public class ContactCentreTransferController extends BasicController{
	
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ContactCentreTransferController.class);

	
	@GetMapping("/{name}")
    public List<?> incomingCall(@PathVariable("name") String name) throws Exception {
		log.info("Into saveTransferType");
		List<TransferType> transfer = serviceFactory.getTransferTypeByName(name);
		log.info("END saveTransferType");
		return transfer;
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
