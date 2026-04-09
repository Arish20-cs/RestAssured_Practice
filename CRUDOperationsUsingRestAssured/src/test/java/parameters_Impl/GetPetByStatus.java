package parameters_Impl;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetPetByStatus {
	@Test
	public void getByStatus() {
		RestAssured.given()
		.queryParam("status", "available")
		.when().get("https://petstore.swagger.io/v2/pet/findByStatus")
		.then().log().all();
	}
}
