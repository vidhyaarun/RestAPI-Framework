package tests.rest;

import java.io.File;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;

public class Plan_Put extends RESTAssuredBase {
	//For Reporting 
		@BeforeTest// - > 2
		public void setValues() {

			testCaseName = "Validate plan Page Api";
			testDescription = "Verify Plan - Put(update) request ";
			nodes = "/plan/10dee178-bb80-11ea-9226-8ea21db6e23d";
			category = "REST";
			dataFileName = "plan put";
			dataFileType = "JSON";
		}
		
		@Test(dataProvider = "fetchData")
		public void planput(File file) {		
			
			
			// Post the request
			Response response = putWithBodyAsFileAndUrl(file,"/plan/10dee178-bb80-11ea-9226-8ea21db6e23d");
		  
			// Verify the Content type
			verifyContentType(response, "JSON");
			
			// Verify the response status code
			verifyResponseCode(response, 200);	
			
			//Verify the response time 
			verifyResponseTime(response, 2000);		
			enableResponseLog(response);
			
		}


	}


