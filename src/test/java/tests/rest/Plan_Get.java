package tests.rest;

import java.io.File;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;

public class Plan_Get extends RESTAssuredBase {
	
	
		//For Reporting 
			@BeforeTest// - > 2
			public void setValues() {

				testCaseName = "Validate plan Page Api";
				testDescription = "Verify Plan - Get request ";
				nodes = "/plan/10dee178-bb80-11ea-9226-8ea21db6e23d";
				category = "REST";
				dataFileName = "plan";
				dataFileType = "JSON";
			}
			
			@Test
			public void planget() {		
				
				
				// Post the request
				Response response = get("/plan/10dee178-bb80-11ea-9226-8ea21db6e23d");
			  
				// Verify the Content type
				verifyContentType(response, "JSON");
				
				// Verify the response status code
				verifyResponseCode(response, 200);	
				
				//Verify the response time 
				verifyResponseTime(response, 2000);		
				enableResponseLog(response);
				
			}}


		
