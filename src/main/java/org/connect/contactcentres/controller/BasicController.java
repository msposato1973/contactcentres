package org.connect.contactcentres.controller;

import org.connect.contactcentres.service.IFunctionalityService;
import org.connect.contactcentres.service.IServiceFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BasicController {

	@Autowired
	protected IServiceFactory serviceFactory;
	
	@Autowired
	protected IFunctionalityService functionalityService;
	
}
