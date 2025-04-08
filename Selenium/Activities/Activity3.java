package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		//open the browser usingurl
		
		driver.get("https://training-support.net/webelements/login-form");
		System.out.println("Current page title is :" + driver.getTitle());
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("password");
//		driver.findElement(By.className("svelte-1pdjkmx")).click(); //using classname
		driver.findElement(By.xpath("//button[@class='svelte-1pdjkmx']")).click();  
		String message = driver.findElement(By.tagName("h1")).getText();
		driver.quit();

	}

}
