package stepDefination;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class FirstTest extends BaseClass{
	@Given("the User is on the TS homepage")
	public void openpage()
	{
		driver.get("https://training-support.net/");
		
		assertEquals(driver.getTitle(),"Training Support");
		
		
	}
	

	@When("they click on the about us link")
	public void clicklink()
	{
		driver.findElement(By.linkText("Abdout us")).click();
	}
	
	@Then("they are redirected to about page")
	public void redirectToAbout()
	{
		assertEquals(driver.getTitle(), "About Training Support");
	}
}
