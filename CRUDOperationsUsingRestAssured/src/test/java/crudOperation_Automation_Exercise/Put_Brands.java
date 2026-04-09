package crudOperation_Automation_Exercise;

import io.restassured.RestAssured;

public class Put_Brands {
public static void main(String[] args) {
	//precondition
		RestAssured.given()
		//HTTP Method
		.when()
		.put(" https://automationexercise.com/api/brandsList")
		//response
		.then().statusCode(200).log().all();
}
}
