package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

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
public class Activity1 {
  @Test (priority=1)
  public void addNewPet() {
	  //create request body
	  
	  Map<String, Object> reqBody=new HashMap<>();
	  reqBody.put("id", 333555);
	  reqBody.put("name", "Rock");
	  reqBody.put("status", "alive");
	  
	  //send request, get response ,assert response
	  
	  given()
	  .baseUri("https://petstore.swagger.io/v2/pet")
	  .header("Content-Type", "application/json")
	  .body(reqBody)
	  
	  .when()
	  .post()
	  
	  .then()
	  .statusCode(200)
	  .body("name", equalTo("Rock"))
	  .body("status", equalTo("alive"));
  }
  
  @Test (priority=2)
  public void getPathInfo() {
	  given()
	  .baseUri("https://petstore.swagger.io/v2/pet")
	  .header("Content-Type", "application/json")
	  .pathParam("petId", 333555)
	  .log().all()
	  
	  .when()
	  .get("/{petId}")
	  
	  .then()
	  .log().all()
	  .statusCode(200)
	  .body("name", equalTo("Rock"))
	  .body("status", equalTo("alive"));
	  
  }
  
  @Test (priority=3)
  public void deletePet() {
	  
	  given()
	  .baseUri("https://petstore.swagger.io/v2/pet")
	  .header("Content-Type", "application/json")
	  .pathParam("petId", 333555)
	  .log().all()
	  
	  .when()
	  .delete("/{petId}")
	  
	  .then()
	  .log().all()
	  .statusCode(200)
	  .body("message", equalTo("333555"));
  }

}
