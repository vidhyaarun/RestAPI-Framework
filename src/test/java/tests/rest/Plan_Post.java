package tests.rest;

import java.io.File;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;

public class Plan_Post extends RESTAssuredBase{
	//For Reporting 
	@BeforeTest// - > 2
	public void setValues() {

		testCaseName = "Validate Customer Page Api";
		testDescription = "Verify Customer - POST request ";
		nodes = "plan";
		category = "REST";
		dataFileName = "planpost";
		dataFileType = "JSON";
	}

	@Test(dataProvider = "fetchData")
	public void plan(File file) {		


		// Post the request
		Response response = postWithBodyAsFileAndUrl(file,"plan");

		// Verify the Content type
		verifyContentType(response, "JSON");

		// Verify the response status code
		verifyResponseCode(response, 200);	

		//Verify the response time 
		verifyResponseTime(response, 2000);	
		enableResponseLog(response);
	}
}
