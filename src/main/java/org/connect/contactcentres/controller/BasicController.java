package org.connect.contactcentres.controller;

import org.connect.contactcentres.service.IFunctionalityService;
import org.connect.contactcentres.service.IServiceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public abstract class BasicController {

	@Autowired
	protected IServiceFactory serviceFactory;
	
	@Autowired
	protected IFunctionalityService functionalityService;
	
	// inject via application.properties
    @Value("${welcome.message}")
    protected String message;
    
    @Value("${date.format}")
    protected String dtFormat;
	
	
}
