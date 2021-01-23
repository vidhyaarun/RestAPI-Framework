package tests.rest;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;

public class Subscription_Put extends RESTAssuredBase {
	
	public void setValues()
	{
		testCaseName = "Validate subscription Page Api";
		testDescription = "Verify subscription - Put(update) request";
		nodes = "subscription/cb96f99d-5491-11eb-9a4d-8ea21db6e23d";
		category = "REST";
		dataFileName = "Subscription put";
		dataFileType = "JSON";
	}
	
	@Test(dataProvider = "fetchData")
	public void subscription(File file) {		
		// Post the request
		Response response = putWithBodyAsFileAndUrl(file,"subscription/cb96f99d-5491-11eb-9a4d-8ea21db6e23d");
	  
		// Verify the Content type
		verifyContentType(response, "JSON");
		
		// Verify the response status code
		verifyResponseCode(response, 200);	
		
		//Verify the response time 
		verifyResponseTime(response, 8000);		
		enableResponseLog(response);
	}

}
