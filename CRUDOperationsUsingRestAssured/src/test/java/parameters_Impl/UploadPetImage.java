package parameters_Impl;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class UploadPetImage {
@Test
public void uploadImage() {
	File f=new File("C:\\Users\\Raman\\OneDrive\\Pictures\\wallpaper.jpg");
	RestAssured.given()
	.pathParam("petId",200)
	.formParam("additionalMetadata", "pet photo")
	.multiPart("file", f)
	.when().post("https://petstore.swagger.io/v2/pet/{petId}/uploadImage")
	.then().log().all();
}
}
