package crudOperations_NinjaHR;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class UpdateProject {
public static void main(String[] args) {
	//precondition
			RestAssured.given()
			.contentType(ContentType.JSON)
			.body("{\r\n"
					+ "  \"createdBy\": \"arish\",\r\n"
					+ "  \"projectName\": \"eclipseProject1\",\r\n"
					+ "  \"status\": \"completed\",\r\n"
					+ "  \"teamSize\": 0\r\n"
					+ "}")
			
			//HTTP Method
			.when()
			.put("http://49.249.28.218:8091/project/NH_PROJ_2925")
			//response
			.then().statusCode(200).log().all();
}
}
