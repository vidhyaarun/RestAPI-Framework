package tests.rest;

import java.io.File;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;

public class Addonsubscription_Post extends RESTAssuredBase{
	//For Reporting 
	@BeforeTest// - > 2
	public void setValues() {

		testCaseName = "Validate Addonsubscription Page Api";
		testDescription = "Verify Addonsubscription - POST request ";
		nodes = "subscription/addonRequest";
		category = "REST";
		dataFileName = "post addon subscription";
		dataFileType = "JSON";
	}

	@Test(dataProvider = "fetchData")
	public void Addonsubscriptions(File file) {		


		// Post the request
		Response response = postWithBodyAsFileAndUrl(file,"subscription/addonRequest");

		// Verify the Content type
		verifyContentType(response, "JSON");

		// Verify the response status code
		verifyResponseCode(response, 200);	

		//Verify the response time 
		verifyResponseTime(response, 200);
		enableResponseLog(response);

	}

}
