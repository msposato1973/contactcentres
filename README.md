# contactcentres
## Programming Challenge.

1.1	Introduction

A bank needs to transfer customers who telephone their automated service to different contact centres depending on their reason for calling. 
The transferred calls, need to be distributed evenly and balanced across all contact centres based on 
a contact centre / call handling weighting / transfer type configuration file. 

An example of this configuration is provided in XML format below.

```

<?xml version="1.0" encoding="UTF-8"?>
<transferLocations>
	<transferType>
		<name>lost and stolen</name>
		<location name="London">
			<number>0208705040</number>
			<weight>15</weight>
			<enabled>true</enabled>
		</location>
		<location name="Shipley">
			<number>01274821111</number>
			<weight>5</weight>
			<enabled>false</enabled>
		</location>
		<location name="Manchester">
			<number>01612821950</number>
			<weight>6</weight>
			<enabled>true</enabled>
		</location>	
		<location name="Leeds">
			<number>01132324455</number>
			<weight>4</weight>
			<enabled>true</enabled>
		</location>
	</transferType>
	<transferType>
		<name>fraud</name>
		<location name="Leeds">
			<number>01132321123</number>
			<weight>80</weight>
			<enabled>true</enabled>
		</location>
		<location name="Brentwood">
			<number>01277706060</number>
			<weight>20</weight>
			<enabled>true</enabled>
		</location>
	</transferType>
</transferLocations>
```
## 1.2	Challenge
Write a java Spring / Spring Boot HTTP/JSON Service/s to provide the following functionality:
- •	Take a transfer type as input and return the appropriate telephone number and location name to dial based on the number of previous calls to that transfer type and calculated distribution.
- •	Take a location name as input and enable / disable it from the calculated distribution
- •	Return a view of service transfer metrics data.
- •	Return a view of the service current live configuration.

## Assumptions
•	The implementation does not need to persist state during a jvm restart
•	The locations must be evenly distributed based on their weightings
•	A balanced distribution should always occur
•	Disabled / Enabled location/s will affect distributions immediately 
•	You may utilise any publicly available frameworks or APIs to help with the implementation.
•	The service implementation to be provided can be either:
  - o	A standalone executable jar with embedded web container
  - o	Or WAR to be deployed within a separate Tomcat v9/v10 instance
  
## Deliverables
•	A service implementation of the contact centre call transfer requirement. 
•	Complete API documentation.
•	Documentation on how to run / test the code / and describing how it works. 
•	Package all the source code, deployable/s and documentation. 

This challenge is designed to see how you approach this type of problem rather than an expectation to see a perfect solution.
