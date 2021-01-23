package tests.rest;

import java.io.File;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;

public class Renewal_Post extends RESTAssuredBase{
	//For Reporting 
	@BeforeTest// - > 2
	public void setValues() {

		testCaseName = "Validate Subscription Page Api";
		testDescription = "Verify Subscription - POST request ";
		nodes = "renewal";
		category = "REST";
		dataFileName = "post renewal";
		dataFileType = "JSON";
	}

	@Test(dataProvider = "fetchData")
	public void subscriptions(File file) {		


		// Post the request
		Response response = postWithBodyAsFileAndUrl(file,"renewal");

		// Verify the Content type
		verifyContentType(response, "JSON");

		// Verify the response status code
		verifyResponseCode(response, 200);	

		//Verify the response time 
		verifyResponseTime(response, 2000);
		enableResponseLog(response);

	}

}
