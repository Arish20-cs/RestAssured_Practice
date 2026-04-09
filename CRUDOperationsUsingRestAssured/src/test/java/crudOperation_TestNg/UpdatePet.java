package crudOperation_TestNg;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class UpdatePet {
@Test
public void update_Pet() {
	//precondtion
		RestAssured.given()
		.contentType(ContentType.JSON)
		.body("{\r\n"
	    		+ "  \"id\": 9223372036854775807,\r\n"
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
	    		+ "  \"status\": \"sold\"\r\n"
	    		+ "}")
		
		//HTTP Method
		.when()
		.put("https://petstore.swagger.io/v2/pet")
		
		//response
		.then().log().all();
}
}
