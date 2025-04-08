package activities;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import static org.hamcrest.Matchers.equalTo;
public class FirstTest {
  @Test
  public void getpetqueryparam() {
	  //when: sends request & receiving the response 
	  
	// GET https://petstore.swagger.io/v2/pet/findByStatus?status=alive
	    // GET https://petstore.swagger.io/v2/pet/{petId}
	  
	  Response response=
			  
			  //Given contains requirement for the request
			  given()
			  .baseUri("https://petstore.swagger.io/v2/pet")
			  .header("Content-Type", "application/json")
			  .queryParam("status", "alive")
			  .when()
			  .get("/findByStatus");
	  
	  System.out.println(response.getStatusCode());
	  System.out.println("-----------------------");
	  System.out.println(response.headers().asList());
	  System.out.println("-----------------------");
	  System.out.println(response.getBody().asPrettyString());
	  
	  //To extract Individual properties
	  String petstatus=response.then().extract().path("[0] ['status']");
	  assertEquals(petstatus,"alive");
	  response.then().statusCode(200).body("[0]['status']", equalTo("alive"));
	  //body("[0]['status']", equalTo("alive"))
  }	  

  public void getPetqueryparam() {
	  
	  given()
	  .baseUri("https://petstore.swagger.io/v2/pet")
	  .header("Contant-Type", "application/jason")
	  .pathParam("petid",66362)  //request log
	  .when()
	  .get("{petID}")
	  .then()  //response log
	  .statusCode(200)
	  .body("status", equalTo("alive"));
	 // .body("status", equals("alive"));
	
	  
  }
  //
}
