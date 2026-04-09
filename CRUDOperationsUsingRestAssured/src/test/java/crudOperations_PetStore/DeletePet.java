package crudOperations_PetStore;

import io.restassured.RestAssured;

public class DeletePet {
public static void main(String[] args) {
	//precondition
	RestAssured.given()
	
	//HTTP Method
	.when()
	.delete("https://petstore.swagger.io/v2/pet/9223372036854775807")
	
	//response
	.then().statusCode(200).log().all();
}
}
