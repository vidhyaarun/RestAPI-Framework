package tests.rest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;

public class Renewallist_Get extends RESTAssuredBase{
	//For Reporting 
		@BeforeTest// - > 2
		public void setValues() {

			testCaseName = "Validate Renewal Page Api";
			testDescription = "Verify Renewallist - Get request ";
			nodes = "subscription/renewal?RenewalType=RenewalDue";
			category = "REST";
			dataFileName = "";
			dataFileType = "JSON";
		}
		
		@Test
		public void renewal() {					
			
			// Post the request
			
			Response response = get("subscription/renewal?RenewalType=RenewalDue");
						
		
			
			// Verify the Content type
			verifyContentType(response, "JSON");
		
			
			// Verify the response status code
			verifyResponseCode(response, 200);
			
			
			//Verify the response time 
			verifyResponseTime(response, 200);
			
			
			enableResponseLog(response);
			
		}


	}