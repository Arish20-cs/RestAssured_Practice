package crudOperation_Automation_Exercise;

import io.restassured.RestAssured;

public class Get_All_Brands {
	public static void main(String[] args) {
		//precondition
			RestAssured.given()
			//HTTP Method
			.when()
			.get(" https://automationexercise.com/api/brandsList")
			//response
			.then().statusCode(200).log().all();
	}
}
