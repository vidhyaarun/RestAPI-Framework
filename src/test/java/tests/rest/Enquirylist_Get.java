package tests.rest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;

public class Enquirylist_Get extends RESTAssuredBase{
	//For Reporting 
		@BeforeTest// - > 2
		public void setValues() {

			testCaseName = "Validate Enquiry list Page Api";
			testDescription = "Verify Enquiry list - Get request ";
			nodes = "/enquiry";
			category = "REST";
			dataFileName = "Enquiry";
			dataFileType = "JSON";
		}
		
		@Test
		public void enquiry() {		
			
			
			// Post the request
			Response response = get("/enquiry");
		  
			// Verify the Content type
			verifyContentType(response, "JSON");
			
			// Verify the response status code
			verifyResponseCode(response, 200);	
			
			//Verify the response time 
			verifyResponseTime(response, 2000);
			
			enableResponseLog(response);
			
			
		}	
			
			
		}

