package tests.rest;

import java.io.File;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;

public class Package_Put extends RESTAssuredBase{
	//For Reporting 
		@BeforeTest// - > 2
		public void setValues() {

			testCaseName = "Validate Package Page Api";
			testDescription = "Verify Package - PUT request";
			nodes = "package/e4ee8b63-5a1c-11eb-9a4d-8ea21db6e23d";
			category = "REST";
			dataFileName = "packageput";
			dataFileType = "JSON";
		}
		
		@Test(dataProvider = "fetchData")
		public void packageupdate(File file) {		
			
			
			// Post the request
			Response response = putWithBodyAsFileAndUrl(file,"package/e4ee8b63-5a1c-11eb-9a4d-8ea21db6e23d");
		  
			// Verify the Content type
			verifyContentType(response, "JSON");
			
			// Verify the response status code
			verifyResponseCode(response, 200);	
			
			//Verify the response time 
			verifyResponseTime(response, 2000);
			
			enableResponseLog(response);			
			
		}


	}

