package tests.rest;

import java.io.File;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;

public class Invoicechartlist_Post  extends RESTAssuredBase{
	//For Reporting 
	@BeforeTest// - > 2
	public void setValues() {

		testCaseName = "Validate report invoice chart list Page Api";
		testDescription = "Verify report invoice chart list - POST request ";
		nodes = "report/enqueryList";
		category = "REST";
		dataFileName = "post report invoice list";
		dataFileType = "JSON";
	}

	@Test(dataProvider = "fetchData")
	public void InvoiceChartList(File file) {		


		// Post the request
		Response response = postWithBodyAsFileAndUrl(file,"report/enqueryList");

		// Verify the Content type
		verifyContentType(response, "JSON");

		// Verify the response status code
		verifyResponseCode(response, 200);	

		//Verify the response time 
		verifyResponseTime(response, 2000);

		enableResponseLog(response);
	}

}
