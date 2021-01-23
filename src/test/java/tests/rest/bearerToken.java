package tests.rest;

import org.bson.assertions.Assertions;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import lib.rest.RESTAssuredBase;
import io.restassured.response.Response;


public class bearerToken extends RESTAssuredBase{
	@Test
public static void bearerTokenAuthenticationTest() {
		
		
		RestAssured.baseURI = "https://crmfarm.in/api";
		
		RequestSpecification request = RestAssured.given();
		
		String payload = "{\r\n" + 
				"  \"email\": \"subramanian.t@foyertech.com\",\r\n" + 
				"  \"password\": \"foyer@123\"\r\n" + 
				"}";
		
		request.header("Content-Type","application/json");
		
		Response responseFromGenerateToken = request.body(payload).post("/api/Auth");
		
		responseFromGenerateToken.prettyPrint();
		
		String jsonString = responseFromGenerateToken.getBody().asString();
		
		String tokenGenerated = JsonPath.from(jsonString).get("token");
		
		request.header("Authorization","Bearer "+tokenGenerated)
				.header("Content-Type","application/json");
		
		
		
				
	}

}
