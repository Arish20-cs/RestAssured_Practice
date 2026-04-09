package requestChaining;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.HashMap;

public class NinzaHRM {
	static String projectId;
@Test(priority=1)
public void create() {
	File f=new File("./src/test/resources/CreateProject_Data.json");
	Response res=given().contentType(ContentType.JSON)
	.body(f)
	.when()
	.post("http://49.249.28.218:8091/addProject");
	
	NinzaHRM.projectId=res.jsonPath().getString("projectId");
	System.out.println("projectId is "+NinzaHRM.projectId  );
}
@Test(dependsOnMethods = "create")
public void get() {
	System.out.println("Executing get");
given().pathParam("projectId", projectId)
	
	.when().get("http://49.249.28.218:8091/project/{projectId}")
	.then().log().all()
	;
}
@Test(priority=3)
public void update() {
	  HashMap<String, Object> f=new HashMap<>();
	  f.put("createdBy", "Div");
	  f.put("projectName", "Bot");
	  f.put("status", "completed");
	  f.put("teamSize", 0);
	      Response res=given().contentType(ContentType.JSON)
			.body(f).pathParam("projectId", projectId)
			.when()
			.put("http://49.249.28.218:8091/project/{projectId}");
			System.out.println(res.getStatusCode());
			
			String status=res.jsonPath().getString("status");
			System.out.println("status is "+status  );
}
@Test(dependsOnMethods="update")
public void delete() {
	System.out.println("Executing delete");
	given().pathParam("projectId", projectId)
	
	.when().delete("http://49.249.28.218:8091/project/{projectId}")
	.then().statusCode(204).log().all()
	;
}
}
