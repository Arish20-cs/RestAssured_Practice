package responseValidation;

import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class CreateProject {
@Test
public void create() {
	given()
	.contentType(ContentType.JSON)
	.body("{\r\n"
			+ "  \"createdBy\": \"arm\",\r\n"
			+ "  \"projectName\": \"dvi\",\r\n"
			+ "  \"status\": \"Ongoing\",\r\n"
			+ "  \"teamSize\": 0\r\n"
			+ "}")
	//HTTP Method
	.when()
	.post("http://49.249.28.218:8091/addProject")
	//response
	.then().statusCode(201).log().all()
	.statusLine(containsString("HTTP"))
	.assertThat()
	.body("createdBy", is("arm"))
	.body("status", is("Ongoing"))
	.time(lessThan(5000l))
	;
}
}
