package tests.rest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;

public class Subscription_Delete extends RESTAssuredBase {
	
	
	//For Reporting 
		@BeforeTest// - > 2
		public void setValues() {

			testCaseName = "Validate Subscription Page Api";
			testDescription = "Verify Subscription - Delete request";
			nodes = "subscription/7f7b9342-5a3c-11eb-9a4d-8ea21db6e23d";
			category = "REST";
			dataFileName = "";
			dataFileType = "JSON";
		}
		
		@Test
		public void userdelete() {		
			
			
			// Post the request
			Response response = delete("subscription/7f7b9342-5a3c-11eb-9a4d-8ea21db6e23d");
		  
			// Verify the Content type
			verifyContentType(response, "JSON");
			
			// Verify the response status code
			verifyResponseCode(response, 200);	
			
			//Verify the response time 
			verifyResponseTime(response, 2000);		
			enableResponseLog(response);
			
		}}