package Activities;
import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity1 {
	
	AppiumDriver driver;
	//setup function
	@BeforeClass
	public void setup() throws MalformedURLException, URISyntaxException {
		//set desired capabilities 
		UiAutomator2Options options=new UiAutomator2Options().
		setPlatformName("android").
		setAutomationName("UiAutomator2").
		setAppPackage("com.google.android.calculator").
		setAppActivity("com.android.calculator2.Calculator").
		noReset();
		
		//set up Apium server
		
		URL serverURL=new URI("http://127.0.0.1:4723").toURL();
		
		//Initialize driver
		driver =new AndroidDriver(serverURL,options);
	}

/*	@BeforeClass
	public void iossetup() {
		//set desired capabilities 
		XCUITestOptions options=new XCUITestOptions().
		setPlatformName("ios").
		setAutomationName("XCUITest").
		setApp("path/to/file.ipa").
		noReset();
		URL serverURL=new URI("http:127.0.0.1:4723").toURL();
		
		//Initialize driver
		driver =new iosDriver(serverURL,options);
		
	}

	*/
	
	
	@Test
	
	public void CalculatorTest ()
	{
		driver.findElement(AppiumBy.id("digit_8")).click();
		driver.findElement(AppiumBy.accessibilityId("multiply")).click();
		driver.findElement(AppiumBy.id("digit_3")).click();
		driver.findElement(AppiumBy.id("com.google.android.calculator:id/eq")).click();
		
		//Find and get the result text
	
		String result=driver.findElement(AppiumBy.id("com.google.android.calculator:id/result_final")).getText();
		
		//Assertion
		assertEquals(result, "24");
		
	}
	
	
	@AfterClass
	
	public void teardown()
	{
	//	driver.quit();
	}
}


