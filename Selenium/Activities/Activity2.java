package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		//open the browser usingurl
		
		driver.get("https://training-support.net/webelements/login-form");
		System.out.println("Current page title is :" + driver.getTitle());
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
//		driver.findElement(By.className("svelte-1pdjkmx")).click(); //using classname
		driver.findElement(By.cssSelector("button.svelte-1pdjkmx")).click();  //using CSS
		String message = driver.findElement(By.tagName("h1")).getText();
		driver.quit();
		
		

	}

}
