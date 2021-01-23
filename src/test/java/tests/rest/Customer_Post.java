package tests.rest;

import java.io.File;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;


public class Customer_Post extends RESTAssuredBase{
//For Reporting 
	@BeforeTest// - > 2
	public void setValues() {

		testCaseName = "Validate Customer Page Api";
		testDescription = "Verify Customer - POST request ";
		nodes = "customer";
		category = "REST";
		dataFileName = "customerpost";
		dataFileType = "JSON";
	}
	
	@Test(dataProvider = "fetchData")
	public void customer(File file) {		
		
		
		// Post the request
		Response response = postWithBodyAsFileAndUrl(file,"customer");
	  
		// Verify the Content type
		verifyContentType(response, "JSON");
		
		// Verify the response status code
		verifyResponseCode(response, 200);	
		
		//Verify the response time 
		verifyResponseTime(response, 5000);
		enableResponseLog(response);
	}

}





