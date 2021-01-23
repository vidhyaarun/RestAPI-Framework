package tests.rest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;

public class Planlist_Get extends RESTAssuredBase {
	
	
	//For Reporting 
		@BeforeTest// - > 2
		public void setValues() {

			testCaseName = "Validate plan Page Api";
			testDescription = "Verify plan list - Get request ";
			nodes = "/plan";
			category = "REST";
			dataFileName = "plan";
			dataFileType = "JSON";
		}
		
		@Test
		public void planlistget() {		
			
			
			// Post the request
			Response response = get("/plan");
		  
			// Verify the Content type
			verifyContentType(response, "JSON");
			
			// Verify the response status code
			verifyResponseCode(response, 200);	
			
			//Verify the response time 
			verifyResponseTime(response, 2000);		
			enableResponseLog(response);
			
		}}
