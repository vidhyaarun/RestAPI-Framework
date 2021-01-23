package tests.rest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;

public class Customerlist_Get extends RESTAssuredBase{
	//For Reporting 
		@BeforeTest// - > 2
		public void setValues() {

			testCaseName = "Validate Customer list Page Api";
			testDescription = "Verify Customerlist - GET request ";
			nodes = "/customer";
			category = "REST";
			dataFileName = "Customer";
			dataFileType = "JSON";
		}
		
		@Test()
		public void customer() {		
			
			// Post the request
			Response response = get("/customer");
		  
			// Verify the Content type
			verifyContentType(response, "JSON");
			
			// Verify the response status code
			verifyResponseCode(response, 200);	
			
			//Verify the response time 
			verifyResponseTime(response, 2000);
			
			enableResponseLog(response);
		}
			
		}
