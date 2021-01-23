package tests.rest;

import java.io.File;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;

public class Enquirychartlist_Post  extends RESTAssuredBase{
	//For Reporting 
	@BeforeTest// - > 2
	public void setValues() {

		testCaseName = "Validate report Enquiry chart list Page Api";
		testDescription = "Verify report Enquiry chart list - POST request ";
		nodes = "report/enqueryList";
		category = "REST";
		dataFileName = "post report enquiry list";
		dataFileType = "JSON";
	}

	@Test(dataProvider = "fetchData")
	public void EnquiryChartList(File file) {		


		// Post the request
		Response response = postWithBodyAsFileAndUrl(file,"report/enqueryList");

		// Verify the Content type
		verifyContentType(response, "JSON");

		// Verify the response status code
		verifyResponseCode(response, 200);	

		//Verify the response time 
		verifyResponseTime(response, 2000);

	}

}
