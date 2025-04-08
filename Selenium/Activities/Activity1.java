package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) {
WebDriver driver=new FirefoxDriver();
		
		//open the browser usingurl
		
		driver.get("https://training-support.net/");
		System.out.println("Current page title is :" + driver.getTitle());
		
		//Find About us link and click it
		
		driver.findElement(By.linkText("About Us")).click();
		System.out.println("Current page title is :" + driver.getTitle());
		
		driver.quit();
		
	}

}
