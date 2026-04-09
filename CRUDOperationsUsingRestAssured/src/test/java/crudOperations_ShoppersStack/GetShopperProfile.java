package crudOperations_ShoppersStack;

import io.restassured.RestAssured;

public class GetShopperProfile {

	public static void main(String[] args) {
		RestAssured.given().get("https://www.shoppersstack.com/shopping/products/alpha")
		.then().statusCode(200);

	}

}
