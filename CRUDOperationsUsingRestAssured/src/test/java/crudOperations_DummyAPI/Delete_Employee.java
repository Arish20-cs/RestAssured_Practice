package crudOperations_DummyAPI;

import io.restassured.RestAssured;

public class Delete_Employee {
public static void main(String[] args) {
	//precondition
			RestAssured.given()
		    //HTTP Method
			.when()
			.delete("https://dummy.restapiexample.com/api/v1/delete/20")
		    //response
			.then().statusCode(200).log().all();
}
}
