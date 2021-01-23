package lib.rest;


import static io.restassured.config.LogConfig.logConfig;
import static io.restassured.config.RestAssuredConfig.newConfig;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentTest;


import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import lib.utils.DataInputProvider;
import lib.utils.HTMLReporter;

public class PreAndTest extends HTMLReporter{
	protected RequestSpecification repoSpec;
	static String accesstoken;
	public String dataFileName, dataFileType;	
	
	
	@BeforeSuite// -> 1 
	public void beforeSuite() {
		startReport();
	}
	
	@BeforeClass// -> 3
	public void beforeClass() {
		startTestCase(testCaseName, testDescription);		
	}
	
	
	@BeforeMethod
	public void beforeMethod() throws FileNotFoundException, IOException {
		//set report details		
		svcTest = startTestModule(nodes);
		svcTest.assignAuthor(authors);
		svcTest.assignCategory(category);
		
		Properties prop = new Properties();
		prop.load(new FileInputStream(new File("./src/test/resources/config.properties")));
	
		RestAssured.baseURI = "https://"+prop.getProperty("server")+"/"+prop.getProperty("resources")+"/";
		//RestAssured.authentication = RestAssured.basic(prop.getProperty("username"), prop.getProperty("password"));
		
	
		 

	}

	@AfterMethod
	public void afterMethod() {
		
	}

	@AfterSuite
	public void afterSuite() {
		endResult();
	}

	@DataProvider(name="fetchData")
	public  Object[][] getData(){
		if(dataFileType.equalsIgnoreCase("Excel"))
			return DataInputProvider.getSheet(dataFileName);	
		else if(dataFileType.equalsIgnoreCase("JSON")){
			Object[][] data = new Object[1][1];
			data[0][0] = new File("./data/"+dataFileName+"."+dataFileType);
			System.out.println(data[0][0]);
			return data;
		}else {
			return null;
		}
			
	}

	@Override
	public long takeSnap() {
		return 0;
	}	

	
	
}
