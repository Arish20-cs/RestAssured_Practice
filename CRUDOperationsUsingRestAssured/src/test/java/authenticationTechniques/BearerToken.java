package authenticationTechniques;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class BearerToken {
	@Test
	public void bearerToken() {
		given()
		.header("Authorization","Bearer "+"token123")
		.when()
		.get("https://httpbin.org/bearer")
		.then().log().all();
	}
}
