package crudOperation_Automation_Exercise;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Search_Product {
@Test
public void search() {
	RestAssured.given()
	.formParam("search_product", "jean")
	.when().post("https://automationexercise.com/api/searchProduct")
	.then().log().all();
}
}
