package crudOperations_PetStore;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Pet_Store_Hashmap {
@Test
public void create() {
	HashMap<String, Object> h=new HashMap<>();
	h.put("id", 30);
	h.put("category",null );
	h.put("name", "fish");
	h.put("photoUrls", null);
	h.put("tags", null);
	h.put("status", "available");
	given()
	.contentType(ContentType.JSON)
	.body(h)
	.when()
	.post("https://petstore.swagger.io/v2/pet")
	.then()
	.statusCode(200)
	.log().all();
	}
@Test(priority=2)
public void get() {
	
	given()
	
	.when().get("https://petstore.swagger.io/v2/pet/30")
	
	.then().log().all();
}

@Test(priority=3)
public void update() {
	HashMap<String, Object> h=new HashMap<>();
	h.put("id", 30);
	h.put("status", "sold");
	given()
	.contentType(ContentType.JSON)
	.body(h)
	.when()
	.put("https://petstore.swagger.io/v2/pet")
	.then().log().all();
	
}

@Test(priority=4)
public void delete() {
	given()
	.when()
	.delete("https://petstore.swagger.io/v2/pet/30")
	.then()
	.log().all();
}

}
