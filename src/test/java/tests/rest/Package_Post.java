package tests.rest;

import java.io.File;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;

public class Package_Post extends RESTAssuredBase{
	//For Reporting 
		@BeforeTest// - > 2
		public void setValues() {

			testCaseName = "Validate Package Page Api";
			testDescription = "Verify Package - POST request ";
			nodes = "/package";
			category = "REST";
			dataFileName = "packagepost";
			dataFileType = "JSON";
		}
		
		@Test(dataProvider = "fetchData")
		public void packagecreate(File file) {		
			
			
			// Post the request
			Response response = postWithBodyAsFileAndUrl(file,"/package");
		  
			// Verify the Content type
			verifyContentType(response, "JSON");
			
			// Verify the response status code
			verifyResponseCode(response, 200);	
			
			//Verify the response time 
			verifyResponseTime(response, 2000);
			
			enableResponseLog(response);
					
		}


	}


