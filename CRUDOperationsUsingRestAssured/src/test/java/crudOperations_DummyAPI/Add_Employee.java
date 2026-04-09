package crudOperations_DummyAPI;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Add_Employee {
public static void main(String[] args) {
	//precondition
			RestAssured.given()
			.contentType(ContentType.JSON)
			.body("{\"name\":\"test\",\"salary\":\"123\",\"age\":\"23\"}")
		    //HTTP Method
			.when()
			.post("https://dummy.restapiexample.com/api/v1/create")
		    //response
			.then().statusCode(200).log().all();
}
}
