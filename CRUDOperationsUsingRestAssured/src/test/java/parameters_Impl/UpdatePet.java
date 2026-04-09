package parameters_Impl;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class UpdatePet {
@Test
public void update() {
	RestAssured.given()
	.pathParam("petId",200)
	.formParam("name", "Kowshik")
	.formParam("status", "available")
	.when().post("https://petstore.swagger.io/v2/pet/{petId}")
	.then().log().all();
}
}
