package tests.rest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;

public class User_Delete extends RESTAssuredBase {
	
	
	//For Reporting 
		@BeforeTest// - > 2
		public void setValues() {

			testCaseName = "Validate User Page Api";
			testDescription = "Verify User - Delete request ";
			nodes = "user/c0b0bae6-5a1e-11eb-9a4d-8ea21db6e23d";
			category = "REST";
			dataFileName = "";
			dataFileType = "JSON";
		}
		
		@Test
		public void userdelete() {		
			
			
			// Post the request
			Response response = delete("user/c0b0bae6-5a1e-11eb-9a4d-8ea21db6e23d");
		  
			// Verify the Content type
			verifyContentType(response, "JSON");
			
			// Verify the response status code
			verifyResponseCode(response, 200);	
			
			//Verify the response time 
			verifyResponseTime(response, 2000);	
			enableResponseLog(response);
			
		}}