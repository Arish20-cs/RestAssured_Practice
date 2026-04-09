package responseValidation;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;



import static io.restassured.RestAssured.*;
public class DeleteProject {
@Test
public void delete() {
	given()
	.pathParam("projectId", "NH_PROJ_205")
	//HTTP Method
	.when()
	.delete("http://49.249.28.218:8091/project/{projectId}")
	//response
	.then().statusCode(204)
	.statusLine(containsString("HTTP"))
	.time(lessThan(5000l))
	.log().all();
	}
}
