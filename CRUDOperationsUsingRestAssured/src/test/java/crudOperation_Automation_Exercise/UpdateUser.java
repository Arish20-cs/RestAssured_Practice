package crudOperation_Automation_Exercise;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class UpdateUser {
	@Test
public void update() {
	RestAssured.given()
	.formParam("name", "kowshik")
	.formParam("email", "kowshik@gmail.com")
	.formParam("password", "akashdhanush")
	.formParam("title", "Mrs")
	
	.formParam("address1", "098")
	.formParam("address2","456")
	
	.formParam("mobile_number", "9876543211")
	.when()
	.put("https://automationexercise.com/api/updateAccount")
	.then().log().all();
}
}
