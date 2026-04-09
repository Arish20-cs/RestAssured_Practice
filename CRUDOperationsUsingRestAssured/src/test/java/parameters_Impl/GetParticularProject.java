package parameters_Impl;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetParticularProject {
@Test
public void getParticularProjectById() {
	RestAssured.given()
	.pathParam("projectId", "NH_PROJ_3368")
	.when().get("http://49.249.28.218:8091/project/{projectId}")
	.then().log().all();
}
}
