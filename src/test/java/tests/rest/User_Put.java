package tests.rest;

import java.io.File;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;

public class User_Put extends RESTAssuredBase {
	//For Reporting 
		@BeforeTest// - > 2
		public void setValues() {

			testCaseName = "Validate plan Page Api";
			testDescription = "Verify put - Put(update) request ";
			nodes = "user/12ac05f8-4a64-11eb-9a4d-8ea21db6e23d";
			category = "REST";
			dataFileName = "userput";
			dataFileType = "JSON";
		}
		
		@Test(dataProvider = "fetchData")
		public void user(File file) {		
			
			
			// Post the request
			Response response = putWithBodyAsFileAndUrl(file,"user/12ac05f8-4a64-11eb-9a4d-8ea21db6e23d");
		  
			// Verify the Content type
			verifyContentType(response, "JSON");
			
			// Verify the response status code
			verifyResponseCode(response, 200);	
			
			//Verify the response time 
			verifyResponseTime(response, 2000);		
			
			enableResponseLog(response);
			
		}


	}


