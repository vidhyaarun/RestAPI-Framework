package tests.rest;

import java.io.File;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;

public class Package_Delete extends RESTAssuredBase {
	
		//For Reporting 
			@BeforeTest// - > 2
			public void setValues() {

				testCaseName = "Validate Package Page Api";
				testDescription = "Verify Package - DELETE request";
				nodes = "/package/f974eb35-598c-11eb-9a4d-8ea21db6e23d";
				category = "REST";
				dataFileName = "package";
				dataFileType = "JSON";
			}
			
			@Test
			public void packagedelete() {		
				
				
				// Post the request
				Response response = delete("/package/f974eb35-598c-11eb-9a4d-8ea21db6e23d");
			  
				// Verify the Content type
				verifyContentType(response, "JSON");
				
				// Verify the response status code
				verifyResponseCode(response, 200);	
				
				//Verify the response time 
				verifyResponseTime(response, 7000);
				
				enableResponseLog(response);
				
				
				
				
				
			}


		}




