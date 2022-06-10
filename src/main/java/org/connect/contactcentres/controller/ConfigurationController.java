package org.connect.contactcentres.controller;

import java.util.List;

import org.connect.contactcentres.model.TransferLocations;
import org.connect.contactcentres.service.IFunctionalityService;
import org.connect.contactcentres.service.IServiceFactory;
import org.connect.contactcentres.utility.ReadFileIO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/liveConfiguration")
@Slf4j
public class ConfigurationController extends BasicController {
	
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ConfigurationController.class);
	
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

}
