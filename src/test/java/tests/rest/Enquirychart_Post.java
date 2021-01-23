package tests.rest;

import java.io.File;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;

public class Enquirychart_Post  extends RESTAssuredBase{
	//For Reporting 
	@BeforeTest// - > 2
	public void setValues() {

		testCaseName = "Validate report Enquiry chart Page Api";
		testDescription = "Verify report Enquiry chart - POST request ";
		nodes = "report/enqueryChart";
		category = "REST";
		dataFileName = "post report enqnuiry chart";
		dataFileType = "JSON";
	}

	@Test(dataProvider = "fetchData")
	public void EnquiryChart(File file) {		


		// Post the request
		Response response = postWithBodyAsFileAndUrl(file,"report/enqueryChart");

		// Verify the Content type
		verifyContentType(response, "JSON");

		// Verify the response status code
		verifyResponseCode(response, 200);	

		//Verify the response time 
		verifyResponseTime(response, 2000);
		enableResponseLog(response);

	}

}
