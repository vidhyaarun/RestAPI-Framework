package tests.rest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;

public class Package_Get extends RESTAssuredBase{
	//For Reporting 
		@BeforeTest// - > 2
		public void setValues() {

			testCaseName = "Validate Package Page Api";
			testDescription = "Verify Package - Get request ";
			nodes = "/package/4a24837a-56ee-11eb-9a4d-8ea21db6e23d";
			category = "REST";
			dataFileName = "Package";
			dataFileType = "JSON";
		}
	
		@Test
		public void packageget() {		
			
			
			// Post the request
			Response response = get("/package/4a24837a-56ee-11eb-9a4d-8ea21db6e23d");
		  
			// Verify the Content type
			verifyContentType(response, "JSON");
			
			// Verify the response status code
			verifyResponseCode(response, 200);	
			
			//Verify the response time 
			verifyResponseTime(response, 1500);
			
			enableResponseLog(response);
			
			}
	}


