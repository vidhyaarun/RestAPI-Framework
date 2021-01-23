package tests.rest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;

public class Plan_Delete extends RESTAssuredBase {
	
	
	//For Reporting 
		@BeforeTest// - > 2
		public void setValues() {

			testCaseName = "Validate plan Page Api";
			testDescription = "Verify Plan - Delete request ";
			nodes = "plan/f3fb62f9-53de-11eb-9a4d-8ea21db6e23d";
			category = "REST";
			dataFileName = "plan";
			dataFileType = "JSON";
		}
		
		@Test
		public void plandelete() {		
			
			
			// Post the request
			Response response = delete("plan/f3fb62f9-53de-11eb-9a4d-8ea21db6e23d");
		  
			// Verify the Content type
			verifyContentType(response, "JSON");
			
			// Verify the response status code
			verifyResponseCode(response, 200);	
			
			//Verify the response time 
			verifyResponseTime(response, 2000);		
			enableResponseLog(response);
			
		}}