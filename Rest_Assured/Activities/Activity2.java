package activities;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.lessThanOrEqualTo;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.AfterClass;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
public class Activity2 {
  @Test (priority=1)
  public void addNewuserinfo() throws IOException {
	  //create request body
	  
	  FileInputStream inputjson=new FileInputStream("src/test/java/activities/userinfo.json");
	
	  given()
	  .baseUri("https://petstore.swagger.io/v2/pet")
	  .header("Content-Type", "application/json")
	  .body(inputjson)
	  
	  .when()
	  .post()
	  
	  .then()
	  
	  .body("code", equalTo(200))
	  .body("message", equalTo("9901"));
	  inputjson.close();
  }
  
  @Test (priority=2)
  public void getUserInfo() {
	  
	  File Outputjson=new File("src/test/java/activities/userinfo.json");
	  
	  Response response= given()
	  .baseUri("https://petstore.swagger.io/v2/pet")
	  .header("Content-Type", "application/json")
	  .pathParam("username", "justinc")
	  .when()
	  .get("/{username}");
	  
	  String resBody=response.getBody().asPrettyString();
	  
	  try {
		  //create JSON file
		Outputjson.createNewFile();
		//Write response body to external file
		
		FileWriter writer=new FileWriter(Outputjson.getPath());
		writer.write(resBody);	
		writer.close();
				
	  }catch(IOException excp) {
	  excp.printStackTrace();
		  
	  }
	  //assertion
	  
	  response.then().body("id", equalTo("9901"));
	  response.then().body("username", equalTo("justinc"));
	  response.then().body("firstName", equalTo("Justin"));
	  response.then().body("lastName", equalTo("Case"));
	  response.then().body("email", equalTo("justincase@mail.com"));
	  response.then().body("password", equalTo("password123"));
	  response.then().body("phone", equalTo("9812763450"));
	 
	  
  }
  
  

}
