package tests.rest;

import java.io.File;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;

public class Invoicechart_Post  extends RESTAssuredBase{
	//For Reporting 
	@BeforeTest// - > 2
	public void setValues() {

		testCaseName = "Validate report invoice chart Page Api";
		testDescription = "Verify report invoice chart - POST request ";
		nodes = "report/invoiceChart";
		category = "REST";
		dataFileName = "post report invoice chart";
		dataFileType = "JSON";
	}

	@Test(dataProvider = "fetchData")
	public void InvoiceChart(File file) {		


		// Post the request
		Response response = postWithBodyAsFileAndUrl(file,"report/invoiceChart");

		// Verify the Content type
		verifyContentType(response, "JSON");

		// Verify the response status code
		verifyResponseCode(response, 200);	

		//Verify the response time 
		verifyResponseTime(response, 2000);
		enableResponseLog(response);

	}

}
