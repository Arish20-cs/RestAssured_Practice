package testNGAnnotations;


import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import pojoClasses.CreateProject;

public class Ninza_Project_Controller_Test {
	static String projectId;
@Test(priority=1)
public void addProjectTest() {
	CreateProject c=new CreateProject();
	c.setCreatedBy("abikowshik");
	c.setProjectName("BotHp");
	c.setStatus("Ongoing");
	c.setTeamSize(0);
	Response res=given().contentType(ContentType.JSON)
	.body(c)
	.when().post("http://49.249.28.218:8091/addProject");
	res.then().log().all();
	projectId=res.jsonPath().getString("projectId");
	SoftAssert soft=new SoftAssert();
	soft.assertEquals(res.jsonPath().getString("createdBy"), "abikowshik");
	soft.assertEquals(res.getStatusCode(), 201);
	soft.assertTrue(res.time()<2000);
}
@Test(priority=2,invocationCount=2)
public void getProjectTest() {
	Response res=given()
			.pathParam("projectId", projectId)
			.when().get("http://49.249.28.218:8091/project/{projectId}");
	res.then().log().all();
	SoftAssert soft=new SoftAssert();
	soft.assertEquals(res.jsonPath().getString("createdBy"), "abikowshik");
	soft.assertEquals(res.jsonPath().getString("projectName"), "BotHp");
	soft.assertEquals(res.getStatusCode(), 200);
	soft.assertTrue(res.time()<2000);
}
@Test(priority=3)
public void updateProjectTest() {
	CreateProject c=new CreateProject();
	c.setCreatedBy("abikowshik");
	c.setProjectName("BotHp");
	c.setStatus("completed");
	c.setTeamSize(0);
	Response res=given().contentType(ContentType.JSON)
	.body(c)
	.pathParam("projectId", projectId)
	.when().put("http://49.249.28.218:8091/project/{projectId}");
	res.then().log().all();
	SoftAssert soft=new SoftAssert();
	soft.assertEquals(res.jsonPath().getString("createdBy"), "abikowshik");
	soft.assertEquals(res.getStatusCode(), 200);
	soft.assertEquals(res.jsonPath().getString("status"), "completed");
	soft.assertTrue(res.time()<2000);
}
@Test(priority=4)
public void deleteProjectTest() {
	Response res=given()
			.pathParam("projectId", projectId)
			.when().delete("http://49.249.28.218:8091/project/{projectId}");
     Assert.assertEquals(res.getStatusCode(), 204);
}
}
