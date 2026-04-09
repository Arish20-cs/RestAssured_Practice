package crudOperation_TestNg;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetAllDetailsOfPet {
@Test
public void getPet() {
	RestAssured.given()
	.when().get("https://petstore.swagger.io/v2/pet/1")
	.then().log().all();
}
}
