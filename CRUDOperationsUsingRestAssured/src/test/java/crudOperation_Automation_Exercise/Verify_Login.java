package crudOperation_Automation_Exercise;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Verify_Login {
@Test
public void verify_Login() {
	HashMap<String,String> h=new HashMap<>();
	h.put("email", "kowshik@gmail.com");
	h.put("password", "akashdhanush");
	RestAssured.given()
	.formParams(h)
	.when().post("https://automationexercise.com/api/verifyLogin")
	.then().log().all();
}
}
