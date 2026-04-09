package crudOperations_NinjaHR;

import io.restassured.RestAssured;

public class GetAllProject {
public static void main(String[] args) {
	//precondition
			RestAssured.given()
			
			//HTTP Method
			.when()
			.get("http://49.249.28.218:8091/projects")
			//response
			.then().statusCode(200).log().all();
			}
}

