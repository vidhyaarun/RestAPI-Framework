package tests.rest;

import java.io.File;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;


public class Enquiry_Get extends RESTAssuredBase{
//For Reporting 
	@BeforeTest// - > 2
	public void setValues() {

		testCaseName = "Validate Enquiry Page Api";
		testDescription = "Verify Enquiry - Get request ";
		nodes = "enquiry/33f8798d-595f-11eb-9a4d-8ea21db6e23d";
		category = "REST";
		dataFileName = "Enquiry";
		dataFileType = "JSON";
	}
	
	@Test()
	public void enquiry() {		
		
		
		// Post the request
		Response response = get("enquiry/33f8798d-595f-11eb-9a4d-8ea21db6e23d");
	  
		// Verify the Content type
		verifyContentType(response, "JSON");
		
		// Verify the response status code
		verifyResponseCode(response, 200);	
		
		//Verify the response time 
		verifyResponseTime(response, 2000);
		
		enableResponseLog(response);
		
		
		
		
		
	}


}





