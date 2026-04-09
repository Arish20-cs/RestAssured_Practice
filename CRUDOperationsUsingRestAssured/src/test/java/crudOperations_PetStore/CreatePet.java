package crudOperations_PetStore;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import pojoClasses.Pet;

public class CreatePet {
    
    public static void main(String[] args) {
    	Pet p = new Pet();
    	p.setId(101);
    	p.setName("doggie");
    	p.setStatus("available");
       
//precondition
        RestAssured.given()
            .contentType(ContentType.JSON)
            .body(p)
     //HTTP method
        .when()
            .post("https://petstore.swagger.io/v2/pet")
            
     //Response section 
        .then()
            .statusCode(200)
            .log().all();
    }
}