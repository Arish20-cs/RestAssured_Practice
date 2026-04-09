package crudOperation_Automation_Exercise;

import io.restassured.RestAssured;

public class GetALlProducts {
public static void main(String[] args) {
	RestAssured.given().get(" https://automationexercise.com/api/productsList")
	.then().statusCode(200).log().all();
}
}
