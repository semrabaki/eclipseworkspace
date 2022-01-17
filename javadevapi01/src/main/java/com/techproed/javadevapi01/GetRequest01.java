package com.techproed.javadevapi01;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class GetRequest01 {
	
	//This down statement is the testing statement

	/*
	 When 
	   I send a GET REquest to the URL  String url="https://restful-booker.herokuapp.com/booking/3";
	   Then
	      HTTP Status Code should be 200
	    And 
	       Content type should be in JSON format
	       
	    And 
	       Status line should be HTTP:/1.1 200 OK
	 */
	//this creates the test anatoation
	
	@Test  
	public void get01() {
		//when you work with api to test something is wokring as expected or not follow the follwing steps
		//1.step: Set the URL
		String url="https://restful-booker.herokuapp.com/booking/3";
		//2.step: Set the expected dtaa
		
		//3.Steo: Send the request to the API
		Response response= given().accept("application/json").when().get(url);  //this code will 
		
		response.prettyPrint();
	}
}
