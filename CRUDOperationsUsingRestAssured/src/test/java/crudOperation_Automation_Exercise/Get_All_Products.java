package crudOperation_Automation_Exercise;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Get_All_Products {
@Test
public void get_Products() {
	RestAssured.given()
	.when().get("https://automationexercise.com/api/productsList")
	.then().log().all();
}
}
