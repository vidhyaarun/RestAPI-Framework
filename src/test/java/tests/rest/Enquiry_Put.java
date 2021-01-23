package tests.rest;

import java.io.File;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;


public class Enquiry_Put extends RESTAssuredBase{
//For Reporting 
	@BeforeTest// - > 2
	public void setValues() {

		testCaseName = "Validate Enquiry Page Api";
		testDescription = "Verify Enquiry - Put(update) request ";
		nodes = "enquiry/9f74297f-5a47-11eb-9a4d-8ea21db6e23d";
		category = "REST";
		dataFileName = "Enquiry";
		dataFileType = "JSON";
	}
	
	@Test(dataProvider = "fetchData")
	public void enquiry(File file) {		
		
		
		// Post the request
		Response response = putWithBodyAsFileAndUrl(file,"enquiry/9f74297f-5a47-11eb-9a4d-8ea21db6e23d");
	  
		// Verify the Content type
		verifyContentType(response, "JSON");
		
		// Verify the response status code
		verifyResponseCode(response, 200);	
		
		//Verify the response time 
		verifyResponseTime(response, 5000);
		enableResponseLog(response);
	}
}





