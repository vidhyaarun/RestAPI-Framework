package tests.rest;

import java.io.File;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;

public class User_Post extends RESTAssuredBase{
	//For Reporting 
	@BeforeTest// - > 2
	public void setValues() {

		testCaseName = "Validate User Page Api";
		testDescription = "Verify User - POST request ";
		nodes = "user";
		category = "REST";
		dataFileName = "userpost";
		dataFileType = "JSON";
	}
	
	@Test(dataProvider = "fetchData")
	public void user(File file) {		
		
		
		// Post the request
		Response response = postWithBodyAsFileAndUrl(file,"user");
	  
		// Verify the Content type
		verifyContentType(response, "JSON");
		
		// Verify the response status code
		verifyResponseCode(response, 200);	
		
		//Verify the response time 
		verifyResponseTime(response, 7000);
		
		enableResponseLog(response);
		
	}


}
