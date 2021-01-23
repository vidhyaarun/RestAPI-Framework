package tests.rest;

import java.io.File;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;


public class Additionorcancellicense_Get extends RESTAssuredBase{
//For Reporting 
	@BeforeTest// - > 2
	public void setValues() {

		testCaseName = "Validate addon or cancel Licencse Page Api";
		testDescription = "Verify addon or cancel Licencse - Get request ";
		nodes = "subscription/cancelLicenses/c539e7ab-444a-11eb-9a4d-8ea21db6e23d";
		category = "REST";
		dataFileName = "";
		dataFileType = "JSON";
	}
	
	@Test
	public void addonorcancelLicencse() {		
		
		
		// Post the request
		Response response = get("subscription/cancelLicenses/c539e7ab-444a-11eb-9a4d-8ea21db6e23d");
	  
		// Verify the Content type
		verifyContentType(response, "JSON");
		
		// Verify the response status code
		verifyResponseCode(response, 200);	
		
		//Verify the response time 
		verifyResponseTime(response, 200);
		
		enableResponseLog(response);
		
		
		
		
		
	}


}





