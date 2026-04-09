package responseValidation;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class UpdateProject {
@Test
public void update() {
	given()
	.contentType(ContentType.JSON)
	.body("{\r\n"
			+ "  \"createdBy\": \"arish\",\r\n"
			+ "  \"projectName\": \"eclipseProject1\",\r\n"
			+ "  \"status\": \"completed\",\r\n"
			+ "  \"teamSize\": 0\r\n"
			+ "}")
	.pathParam("projectId", "NH_PROJ_066")
	
	//HTTP Method
	.when()
	.put("http://49.249.28.218:8091/project/{projectId}")
	//response
	.then().statusCode(200)
	.statusLine(containsString("HTTP"))
	.assertThat()
	.body("createdBy", is("arish"))
	.body("status", is("completed"))
	.body("teamSize", is(0))
	.time(lessThan(5000l))
	.log().all();
}
}
