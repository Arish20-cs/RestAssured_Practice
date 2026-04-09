package requestBody;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class RequestBody_FromExternalFile {
@Test
public void create() {
	File f=new File("./src/test/resources/CreateProject_Data.json");
	//precondition
		RestAssured.given()
		.contentType(ContentType.JSON)
		.body(f).log().all()
		//HTTP Method
		.when()
		.post("http://49.249.28.218:8091/addProject")
		//response
		.then().statusCode(201).log().all();
}
}
