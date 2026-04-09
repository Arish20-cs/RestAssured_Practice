package crudOperations_NinjaHR;

import io.restassured.RestAssured;

public class DeleteProject {
	public static void main(String[] args) {
		//precondition
			RestAssured.given()
			
			//HTTP Method
			.when()
			.delete("http://49.249.28.218:8091/project/NH_PROJ_1987")
			//response
			.then().statusCode(204).log().all();
			}
}
