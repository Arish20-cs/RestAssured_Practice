package requestBody;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import pojoClasses.CreateProject;

public class RequestBody_FromPOJO {
	
@Test
public void create() {
	CreateProject c=new CreateProject();
	c.setCreatedBy("BotHp");
	c.setProjectName("gniddew");
	c.setStatus("Ongoing");
	c.setTeamSize(0);
	
	RestAssured.given()
	.contentType(ContentType.JSON)
	.body(c)
	.when()
	.post("http://49.249.28.218:8091/addProject")
	.then().log().all();
}
}
