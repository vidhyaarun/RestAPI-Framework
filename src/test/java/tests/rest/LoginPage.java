package tests.rest;

import java.io.File;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;

import lib.rest.*;


public class LoginPage extends RESTAssuredBase{
	//For Reporting 
	
	static String accesstoken;
		@BeforeTest// - > 2
		public void setValues() {

			testCaseName = "Validate Login Page Api";
			testDescription = "Verify Login - POST request ";
			nodes = "Auth";
			category = "REST";
			dataFileName = "Login";
			dataFileType = "JSON";
			
		}

		@Test(dataProvider = "fetchData")
		public void enquiry(File file) {	
			
			
			Response response = postWithBodyAsFileAndUrl(file,"Auth");
		
			// Verify the Content type
			//verifyContentType(response, "JSON");
			
			System.out.println(response);
			
			
			// Verify the response status code
			//verifyResponseCode(response, 200);	
			
			
			
		}


}





