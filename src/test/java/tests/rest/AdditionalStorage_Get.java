package tests.rest;

import java.io.File;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;


public class AdditionalStorage_Get extends RESTAssuredBase{
//For Reporting 
	@BeforeTest// - > 2
	public void setValues() {

		testCaseName = "Validate additionStorage Page Api";
		testDescription = "Verify additionStorage - Get request ";
		nodes = "subscription/additionStorageRequest/f1c547a5-4520-11eb-9a4d-8ea21db6e23d";
		category = "REST";
		dataFileName = "";
		dataFileType = "JSON";
	}
	
	@Test
	public void additionStorage() {		
		
		
		// Post the request
		Response response = get("subscription/additionStorageRequest/f1c547a5-4520-11eb-9a4d-8ea21db6e23d");
	  
		// Verify the Content type
		verifyContentType(response, "JSON");
		
		// Verify the response status code
		verifyResponseCode(response, 200);	
		
		//Verify the response time 
		verifyResponseTime(response, 200);
		
		enableResponseLog(response);
		
		
		
		
		
	}


}





