package tests.rest;

import java.io.File;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;

public class Subscriptionchart_Post  extends RESTAssuredBase{
	//For Reporting 
	@BeforeTest// - > 2
	public void setValues() {

		testCaseName = "Validate report Subscrioption chart Page Api";
		testDescription = "Verify report Subscrioption Chart - POST request ";
		nodes = "report/subscriptionChart";
		category = "REST";
		dataFileName = "post report subscriptionchart";
		dataFileType = "JSON";
	}

	@Test(dataProvider = "fetchData")
	public void SubscrioptionChart(File file) {		


		// Post the request
		Response response = postWithBodyAsFileAndUrl(file,"report/subscriptionChart");

		// Verify the Content type
		verifyContentType(response, "JSON");

		// Verify the response status code
		verifyResponseCode(response, 200);	

		//Verify the response time 
		verifyResponseTime(response, 2000);
		
		enableResponseLog(response);

	}

}
