package org.connect.contactcentres.service;

import java.util.List;

import org.connect.contactcentres.model.TransferLocations;

public interface IFunctionalityService {

	// Take a transfer type as input and return 
	// the appropriate telephone number, location name to dial based on the number of previous calls to that transfer type and calculated distribution.
	// Take a location name as input and enable / disable it from the calculated distribution.
	// Return a view of service transfer metrics data.
	// Return a view of the service current live configuration.
	
	/*
	 * - Prendere un tipo di trasferimento come input e restituire il numero di telefono e il nome della posizione appropriati da comporre 
	 *   in base al numero di chiamate precedenti a quel tipo di trasferimento e alla distribuzione calcolata.
	 * 
	 * - Prendere un nome di posizione come input e abilitarlo/disabilitarlo dalla distribuzione calcolata.
	 * 
	 * - Restituire una visualizzazione dei dati delle metriche di trasferimento del servizio.
	 * 
	 • - Restituire una vista della configurazione live corrente del servizio.
	 * 
	 * */
	TransferLocations getViewServiceCurrentLiveConfiguration();
	void anableDisableForLocationName(String loctionName); 
	String getViewServiceTransfeMetricsData();
	List<?> transferMetricsData();

}
