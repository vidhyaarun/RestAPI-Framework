package tests.rest;

import java.io.File;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;


public class Customer_Get extends RESTAssuredBase{
//For Reporting 
	@BeforeTest// - > 2
	public void setValues() {

		testCaseName = "Validate Customer Page Api";
		testDescription = "Verify Customer - GET request ";
		nodes = "/customer/406f02f5-50ee-11eb-9a4d-8ea21db6e23d";
		category = "REST";
		dataFileName = "Customer";
		dataFileType = "JSON";
	}
	
	@Test()
	public void customer() {		
		
		
		// Post the request
		Response response = get("/customer/406f02f5-50ee-11eb-9a4d-8ea21db6e23d");
	  
		// Verify the Content type
		verifyContentType(response, "JSON");
		
		// Verify the response status code
		verifyResponseCode(response, 200);	
		
		//Verify the response time 
		verifyResponseTime(response, 2000);
		
		enableResponseLog(response);
		
	}


}





