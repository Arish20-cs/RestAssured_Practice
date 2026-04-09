package crudOperations_DummyAPI;

import io.restassured.RestAssured;

public class Get_All_Employees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//precondition
		RestAssured.given()
		//HTTP Method
		.when()
		.get("https://dummy.restapiexample.com/api/v1/employees")
		//response
		.then().statusCode(200).log().all();
	}

}
