package tests.rest;

import java.io.File;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;


public class Userlist_Get extends RESTAssuredBase{
//For Reporting 
	@BeforeTest// - > 2
	public void setValues() {

		testCaseName = "Validate User Page Api";
		testDescription = "Verify User - Get request ";
		nodes = "user";
		category = "REST";
		dataFileName = "";
		dataFileType = "JSON";
	}
	
	@Test
	public void user() {		
		
		
		// Post the request
		Response response = get("user");
	  
		// Verify the Content type
		verifyContentType(response, "JSON");
		
		// Verify the response status code
		verifyResponseCode(response, 200);	
		
		//Verify the response time 
		verifyResponseTime(response, 2000);
		
		enableResponseLog(response);		
		
	}


}





