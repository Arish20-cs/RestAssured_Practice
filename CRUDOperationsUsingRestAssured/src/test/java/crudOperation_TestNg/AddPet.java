package crudOperation_TestNg;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class AddPet {
@Test
public void create() {
	RestAssured.given()
	.contentType(ContentType.JSON)
	.body("{\r\n"
    		+ "  \"id\": 0,\r\n"
    		+ "  \"category\": {\r\n"
    		+ "    \"id\": 0,\r\n"
    		+ "    \"name\": \"Doggy\"\r\n"
    		+ "  },\r\n"
    		+ "  \"name\": \"doggie\",\r\n"
    		+ "  \"photoUrls\": [\r\n"
    		+ "    \"string\"\r\n"
    		+ "  ],\r\n"
    		+ "  \"tags\": [\r\n"
    		+ "    {\r\n"
    		+ "      \"id\": 0,\r\n"
    		+ "      \"name\": \"string\"\r\n"
    		+ "    }\r\n"
    		+ "  ],\r\n"
    		+ "  \"status\": \"available\"\r\n"
    		+ "}")
	.when().post("https://petstore.swagger.io/v2/pet")
	.then().log().all();
}
}
