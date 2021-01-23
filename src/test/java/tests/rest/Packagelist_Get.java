package tests.rest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;

public class Packagelist_Get extends RESTAssuredBase {
	//For Reporting 
			@BeforeTest// - > 2
			public void setValues() {

				testCaseName = "Validate Package Page Api";
				testDescription = "Verify Package list - Get request ";
				nodes = "/package";
				category = "REST";
				dataFileName = "Package";
				dataFileType = "JSON";
			}
		
			@Test
			public void packagelistget() {		
				
				
				// Post the request
				Response response = get("/package");
			  
				// Verify the Content type
				verifyContentType(response, "JSON");
				
				// Verify the response status code
				verifyResponseCode(response, 200);	
				
				//Verify the response time 
				verifyResponseTime(response, 1500);
				
				enableResponseLog(response);
				
				}
		}


