package tests.rest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;

public class NoofUserChart_Get extends RESTAssuredBase {
	
	
	//For Reporting 
		@BeforeTest// - > 2
		public void setValues() {

			testCaseName = "Validate user chart Page Api";
			testDescription = "Verify user chart - get request ";
			nodes = "report/noOfUsersChart";
			category = "REST";
			dataFileName = "";
			dataFileType = "JSON";
		}
		
		@Test
		public void userchartget() {		
			
			
			// Post the request
			Response response = get("report/noOfUsersChart");
		  
			// Verify the Content type
			verifyContentType(response, "JSON");
			
			// Verify the response status code
			verifyResponseCode(response, 200);	
			
			//Verify the response time 
			verifyResponseTime(response, 2000);		
			enableResponseLog(response);
			
		}}
