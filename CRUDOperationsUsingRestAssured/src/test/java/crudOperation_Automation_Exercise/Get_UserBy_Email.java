package crudOperation_Automation_Exercise;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Get_UserBy_Email {
@Test
public void get_User() {
	RestAssured.given()
	.formParam("email", "kowshik@gmail.com")
	.when().get("https://automationexercise.com/api/getUserDetailByEmail")
	.then().log().all();
}
}
