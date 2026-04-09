package crudOperation_Automation_Exercise;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Delete_User {
@Test
public void delete() {
RestAssured.given()
.formParam("email", "kowshik@gmail.com")
.formParam("password", "akashdhanush")
.when().delete("https://automationexercise.com/api/deleteAccount")
.then().log().all();
}
}
