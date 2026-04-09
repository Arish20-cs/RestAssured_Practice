package requestBody;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class RequestBody_AsHashMap  {
public static void main(String[] args) {
	
	HashMap<String,String> data=new HashMap<>();
	data.put("createdBy", "dav");
	data.put("projectName", "dev2");
	data.put("status", "Ongoing");
	data.put("teamSize", "0");
	//precondition
	RestAssured.given()
	.contentType(ContentType.JSON)
	.body(data)
	.log().all()
	//HTTP Method
	.when()
	.post("http://49.249.28.218:8091/addProject")
	
	//Response
	.then().statusCode(201).log().all();
	
}
}
