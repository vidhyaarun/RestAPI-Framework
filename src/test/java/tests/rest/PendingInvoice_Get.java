package tests.rest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;

public class PendingInvoice_Get extends RESTAssuredBase{
	//For Reporting 
		@BeforeTest// - > 2
		public void setValues() {

			testCaseName = "Validate Pending Invoice Page Api";
			testDescription = "Verify Pending Invoice - Get request ";
			nodes = "subscription/pendingInvoice/06a3a15e-4a85-11eb-9a4d-8ea21db6e23d";
			category = "REST";
			dataFileName = "";
			dataFileType = "JSON";
		}
		
		@Test
		public void PendingInvoice() {					
			
			// Post the request
			
			Response response = get("subscription/pendingInvoice/06a3a15e-4a85-11eb-9a4d-8ea21db6e23d");
						
		
			
			// Verify the Content type
			verifyContentType(response, "JSON");
		
			
			// Verify the response status code
			verifyResponseCode(response, 200);
			
			
			//Verify the response time 
			verifyResponseTime(response, 200);
			
			
			enableResponseLog(response);
			
		}


	}