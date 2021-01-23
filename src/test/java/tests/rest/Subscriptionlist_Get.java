package tests.rest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;

public class Subscriptionlist_Get extends RESTAssuredBase{
	//For Reporting 
		@BeforeTest// - > 2
		public void setValues() {

			testCaseName = "Validate Subscription Page Api";
			testDescription = "Verify Subscription - Get request ";
			nodes = "subscription?Skip=0&Take=1000";
			category = "REST";
			dataFileName = "";
			dataFileType = "JSON";
		}
		
		@Test
		public void Subscritption() throws InterruptedException {					
			
			// Post the request
			
			Response response = get("subscription?Skip=0&Take=1000");
						
		
			
			// Verify the Content type
			verifyContentType(response, "JSON");
		
			
			// Verify the response status code
			verifyResponseCode(response, 200);
			
			
			//Verify the response time 
			verifyResponseTime(response, 2000);
			
			
			enableResponseLog(response);
			
		}


	}