package requestBody;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class RequestBody_FromAMethod {
	public static void main(String[] args) {
		//precondition
		RestAssured.given()
		.contentType(ContentType.JSON)
		.body(PayLoad.createAProject())
		//HTTP Method
		.when()
		.post("http://49.249.28.218:8091/addProject")
		//response
		.then().statusCode(201).log().all();
		}
}
