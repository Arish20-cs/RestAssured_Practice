package responseValidation;



import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetProject {
@Test
public void get() {
	given()
	.pathParam("projectId", "NH_PROJ_205")
	.when()
	.get("http://49.249.28.218:8091/project/{projectId}")
	.then()
	.log().all()
	.assertThat()
	.statusCode(200)
	.statusLine(containsString("HTTP"))
	.time(lessThan(1000l));
}
}
