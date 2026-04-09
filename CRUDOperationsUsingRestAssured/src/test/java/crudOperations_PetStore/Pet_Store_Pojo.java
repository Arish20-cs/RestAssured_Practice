package crudOperations_PetStore;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import pojoClasses.Pet;

public class Pet_Store_Pojo {
	Pet p=new Pet();
	
@Test(priority=1)
public void create() {
	p.setId(20);
	p.setName("Flemming");
	p.setStatus("available");
	
	given()
	.contentType(ContentType.JSON)
	.body(p)
	.when()
	.post("https://petstore.swagger.io/v2/pet")
	.then()
	.statusCode(200)
	.log().all();
}
@Test(priority=2)
public void get() {
	
	given()
	
	.when().get("https://petstore.swagger.io/v2/pet/"+p.getId())
	
	.then().log().all()
	.statusCode(200);
}

@Test(priority=3)
public void update() {
	p.setStatus("sold");
	given()
	.contentType(ContentType.JSON)
	.body(p)
	.when()
	.put("https://petstore.swagger.io/v2/pet")
	.then().log().all();
	
}

@Test(priority=4)
public void delete() {
	given()
	.when()
	.delete("https://petstore.swagger.io/v2/pet/"+p.getId())
	.then()
	.log().all();
}

}
