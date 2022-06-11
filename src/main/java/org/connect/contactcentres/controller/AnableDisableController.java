package org.connect.contactcentres.controller;

import org.connect.contactcentres.model.TransferLocations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/anableDisableController")
@Slf4j
public class AnableDisableController  extends BasicController{

	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(AnableDisableController.class);
	
	
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
	
}
