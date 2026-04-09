package crudOperation_Automation_Exercise;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Search_Product_WithOut {
	@Test
	public void search() {
		RestAssured.given()
		.when().post("https://automationexercise.com/api/searchProduct")
		.then().log().all();
	}
}
