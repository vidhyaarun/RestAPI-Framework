package tests.rest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;

public class NoofUserChartlist_Get extends RESTAssuredBase {
	
	
	//For Reporting 
		@BeforeTest// - > 2
		public void setValues() {

			testCaseName = "Validate user chart list Page Api";
			testDescription = "Verify user chart list - get request ";
			nodes = "report/noOfUsersList";
			category = "REST";
			dataFileName = "";
			dataFileType = "JSON";
		}
		
		@Test
		public void userchartlistget() {		
			
			
			// Post the request
			Response response = get("report/noOfUsersList");
		  
			// Verify the Content type
			verifyContentType(response, "JSON");
			
			// Verify the response status code
			verifyResponseCode(response, 200);	
			
			//Verify the response time 
			verifyResponseTime(response, 2000);		
			enableResponseLog(response);
			
		}}
