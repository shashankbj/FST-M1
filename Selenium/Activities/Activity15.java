package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity15 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		//open the browser usingurl
		driver.get("https://training-support.net/webelements/dynamic-attributes");
		System.out.println("Current page title is :" + driver.getTitle());
		
		driver.findElement(By.xpath("//input[@placeholder='Full name']")).sendKeys("Naeem");
	    driver.findElement(By.xpath("//input[contains(@id, '-email')]")).sendKeys("abcde@gmail.com");
	    driver.findElement(By.xpath("//label[contains(text(), 'event')]/following-sibling::input[@type='date']")).sendKeys("2025-03-10");
	    driver.findElement(By.xpath("//textarea[contains(@id, '-additional-details-')]")).sendKeys("End of course party");
	    driver.findElement(By.xpath("//button[text()='Submit']")).click();
	    String msg=driver.findElement(By.id("action-confirmation")).getText();
	    System.out.println("Sucess message : " + msg);
	    driver.quit();
	}

}
