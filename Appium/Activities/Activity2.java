package Activities;


import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity2 {
	
	AppiumDriver driver;
	//setup function
	@BeforeClass
	public void setup() throws MalformedURLException, URISyntaxException {
		//set desired capabilities 
		UiAutomator2Options options=new UiAutomator2Options().
		setPlatformName("android").
		setAutomationName("UiAutomator2").
		setAppPackage("com.android.chrome").
		setAppActivity("com.google.android.apps.chrome.Main").
		noReset();
		
		//set up Apium server
		
		
		URL serverURL=new URI("http://127.0.0.1:4723").toURL();
		
		//Initialize driver
		driver =new AndroidDriver(serverURL,options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://training-support.net");
		
	}

	
	@Test
	
	public void chromeTest ()
	{
		String pageTitle = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Training Support\"]")).getText();
		System.out.println("Heading: " + pageTitle);
	
		
		 // Find and click the About Us link
        driver.findElement(AppiumBy.accessibilityId("About Us")).click();
		
     // Find heading of new page and print to console
        String aboutPageHeading = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='About Us']" )).getText();
        System.out.println(aboutPageHeading);
        
		
	}
	
	
	@AfterClass
	
	public void teardown()
	{
	//	driver.quit();
	}
}



