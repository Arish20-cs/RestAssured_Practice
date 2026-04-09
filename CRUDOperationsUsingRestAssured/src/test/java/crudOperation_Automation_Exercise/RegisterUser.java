package crudOperation_Automation_Exercise;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class RegisterUser {
@Test
public void User() {
	RestAssured.given()
	.formParam("name", "kowshik")
	.formParam("email", "kowshik@gmail.com")
	.formParam("password", "akashdhanush")
	.formParam("title", "Mr")
	.formParam("birth_date","12")
	.formParam("birth_month", "June")
	.formParam("birth_year", "2005")
	.formParam("firstname","abi")
	.formParam("lastname","shek")
	.formParam("company", "cap")
	.formParam("address1", "123")
	.formParam("address2","456")
	.formParam("country", "India")
	.formParam("zipcode", "7689")
	.formParam("state", "TN")
	.formParam("city", "chennai")
	.formParam("mobile_number", "9876543210")
	.when()
	.post("https://automationexercise.com/api/createAccount")
	.then().log().all();
}
}
