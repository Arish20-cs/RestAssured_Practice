package crudOperation_TestNg;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeletePet {
@Test
public static void delete() {
	//precondition
		RestAssured.given()
		
		//HTTP Method
		.when()
		.delete("https://petstore.swagger.io/v2/pet/9223372036854775807")
		
		//response
		.then().statusCode(200).log().all();
}
}
