package authenticationTechniques;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class OAuth2 {
@Test
public void oauth2() {
	given()
	.auth().oauth2("token123")
	.when()
	.get("https://httpbin.org/bearer")
	.then().log().all();
}
}
