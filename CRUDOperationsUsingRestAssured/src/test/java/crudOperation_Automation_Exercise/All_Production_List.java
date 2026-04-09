package crudOperation_Automation_Exercise;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class All_Production_List {
@Test
public void addAllProduct() {
	RestAssured.given()
	.when()
	.post("https://automationexercise.com/api/productsList")
	.then().log().all();
}
}
