package org.connect.contactcentres.utility;

import java.util.List;
import java.util.Map;

import org.connect.contactcentres.model.Distribution;
import org.connect.contactcentres.model.TransferLocations;
import org.connect.contactcentres.model.TransferType;

public class SingletonCalculatedDistribution {
	
	private static SingletonCalculatedDistribution calculatedInstance;
	private static TransferLocations transferLocationsInstance;
	private static List<Distribution> listDistribution;
	private static Map<String, List<TransferType>> mapInventory;

    //private constructor.
    private SingletonCalculatedDistribution(){
    	setTransferLocationsInstance(new TransferLocations(List.of(new TransferType())
    	));
    	
        //Prevent form the reflection api.
        if (calculatedInstance != null){
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    } 

    public static SingletonCalculatedDistribution getInstance(){
        if (calculatedInstance == null){ //if there is no instance available... create new one
        	calculatedInstance = new SingletonCalculatedDistribution();
        }

        return calculatedInstance;
    }

	public static TransferLocations getTransferLocationsInstance() {
		return transferLocationsInstance;
	}

	public void setTransferLocationsInstance(TransferLocations transferLocationsInstance) {
		SingletonCalculatedDistribution.transferLocationsInstance = transferLocationsInstance;
	}
	
	public static List<Distribution> getListDistribution() {
		return listDistribution;
	}

	public static void setListDistribution(List<Distribution> listDistribution) {
		SingletonCalculatedDistribution.listDistribution = listDistribution;
	}

	public static Map<String, List<TransferType>> getMapInventory() {
		return mapInventory;
	}

	public void setMapInventory(Map<String, List<TransferType>> mapInventory) {
		SingletonCalculatedDistribution.mapInventory = mapInventory;
	}

}
