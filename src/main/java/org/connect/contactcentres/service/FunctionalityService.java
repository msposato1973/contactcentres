package org.connect.contactcentres.service;

import java.util.List;

import org.connect.contactcentres.model.Location;
import org.connect.contactcentres.model.TransferLocations;
import org.connect.contactcentres.model.TransferType;
import org.connect.contactcentres.response.CalculatedDistributionResponse;
import org.connect.contactcentres.utility.SingletonCalculatedDistribution;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class FunctionalityService implements IFunctionalityService {
	
	 private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(FunctionalityService.class);


	@Override
	public TransferLocations getViewServiceCurrentLiveConfiguration() {
		SingletonCalculatedDistribution.getInstance();
		// TODO Auto-generated method stub
		return SingletonCalculatedDistribution.getTransferLocationsInstance();
	}

	@Override
	public String getViewServiceTransfeMetricsData() {
		// TODO Auto-generated method stub
		return null;
	}

	

	 
	public CalculatedDistributionResponse getTeleNumberAndNamePosition(TransferType transferType) {
		// TODO Auto-generated method stub
		SingletonCalculatedDistribution.getInstance();
		// response.setAppropriateTelephoneNumber();
		transferType.getName();
		 
		return null;
	}

	@Override
	public List<?> transferMetricsData() {
		// TODO Auto-generated method stub
		SingletonCalculatedDistribution.getInstance();
		
		return List.of(new CalculatedDistributionResponse());
	}

	@Override
	public void anableDisableForLocationName(String loctionName) {
		// TODO Auto-generated method stub
		 
		SingletonCalculatedDistribution.getTransferLocationsInstance().getTransferType().forEach( x -> {
			chekEnableDisableLocation(loctionName, x.getLocation());
		});
	}

	void chekEnableDisableLocation(String locationName, List<Location> location) {
		location.stream().forEach(item -> {
			if(item.getName().equalsIgnoreCase(locationName)) {
				item.setEnabled(item.isEnabled()? false: true);
			}
		});
	}
	 


}
