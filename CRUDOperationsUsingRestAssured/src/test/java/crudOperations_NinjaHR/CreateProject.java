package crudOperations_NinjaHR;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class CreateProject {
public static void main(String[] args) {
	//precondition
	RestAssured.given()
	.contentType(ContentType.JSON)
	.body("{\r\n"
			+ "  \"createdBy\": \"ard\",\r\n"
			+ "  \"projectName\": \"div\",\r\n"
			+ "  \"status\": \"Ongoing\",\r\n"
			+ "  \"teamSize\": 0\r\n"
			+ "}")
	//HTTP Method
	.when()
	.post("http://49.249.28.218:8091/addProject")
	//response
	.then().statusCode(201).log().all();
	}
}
