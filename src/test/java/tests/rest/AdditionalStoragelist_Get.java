package tests.rest;

import java.io.File;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;


public class AdditionalStoragelist_Get extends RESTAssuredBase{
//For Reporting 
	@BeforeTest// - > 2
	public void setValues() {

		testCaseName = "Validate additionStorage list Page Api";
		testDescription = "Verify additionStoragelist - Get request ";
		nodes = "subscription/additionStorageRequest";
		category = "REST";
		dataFileName = "";
		dataFileType = "JSON";
	}
	
	@Test
	public void additionStoragelist() {		
		
		
		// Post the request
		Response response = get("subscription/additionStorageRequest");
	  
		// Verify the Content type
		verifyContentType(response, "JSON");
		
		// Verify the response status code
		verifyResponseCode(response, 200);	
		
		//Verify the response time 
		verifyResponseTime(response, 200);
		
		enableResponseLog(response);		
		
	}

}





