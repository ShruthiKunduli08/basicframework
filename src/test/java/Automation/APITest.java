package Automation;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class APITest {
	
	@Test
	public void verifyAPI()
	{
		String baseUri="https://reqres.in/";
		
		Response response=given().contentType(ContentType.JSON).baseUri(baseUri).when().get("api/users/3");
		System.out.println(response.asString());
		
		Assert.assertEquals(response.statusCode(), 200);
		
	}
	
	@Test
	public void verifyPOSTAPI()
	{
		String baseUri="https://reqres.in/";
		
		Response response=given().contentType(ContentType.JSON).baseUri(baseUri).body("{\r\n"
				+ "    \"name\": \"Shruthi\",\r\n"
				+ "    \"job\": \"Testing\"\r\n"
				+ "}").when().post("api/users");
		System.out.println(response.asString());
		
		Assert.assertEquals(response.statusCode(), 201);
	
	}
	
	@Test
	public void verifyPUTAPI()
	{
		String baseUri="https://reqres.in/";
		
		Response response=given().contentType(ContentType.JSON).baseUri(baseUri).body("{\r\n"
				+ "    \"name\": \"ShruthiRai\",\r\n"
				+ "    \"job\": \"Test Lead\"\r\n"
				+ "}").when().put("api/users/2");
		System.out.println(response.asString());
		
		Assert.assertEquals(response.statusCode(), 200);
		JsonPath   js = new JsonPath(response.asString());
		System.out.println(js.get("name").toString());
	
	}
	
	@Test
	public void verifyDeleteAPI()
	{
		String baseUri="https://reqres.in/";
		
		Response response=given().contentType(ContentType.JSON).baseUri(baseUri).when().delete("api/users/2");
		System.out.println(response.asString());
		
		Assert.assertEquals(response.statusCode(), 204);
	
	}
	
	
	
	

	
	

}
