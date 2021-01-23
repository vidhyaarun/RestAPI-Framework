package tests.rest;

import java.io.File;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;


public class Customer_Put extends RESTAssuredBase{
//For Reporting 
	@BeforeTest// - > 2
	public void setValues() {

		testCaseName = "Validate Enquiry Page Api";
		testDescription = "Verify Enquiry - Put request";
		nodes = "customer/5b073d48-5a1b-11eb-9a4d-8ea21db6e23d";
		category = "REST";
		dataFileName = "customer put";
		dataFileType = "JSON";
	}
	
	@Test(dataProvider = "fetchData")
	public void customer(File file) {		
		
		
		// Post the request
		Response response = putWithBodyAsFileAndUrl(file,"customer/5b073d48-5a1b-11eb-9a4d-8ea21db6e23d");
	  
		// Verify the Content type
		verifyContentType(response, "JSON");
		
		// Verify the response status code
		verifyResponseCode(response, 200);	
		
		//Verify the response time 
		verifyResponseTime(response, 5000);
		enableResponseLog(response);		
	}


}





