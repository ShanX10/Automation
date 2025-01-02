package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGassignment {
	 WebDriver browserObject;

	    @BeforeMethod
	    public void setup() {
	        // Set the path to your WebDriver executable
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Initialize the WebDriver
	        browserObject = new ChromeDriver();
	    }

	    @Test 
	 
	    public void testNGassignment() {
	        // Enter the URL
	        browserObject.get("http://demo.itlearn360.com/");
	        System.out.println("Demo site is open in the Chrome browser");

	        // Maximize window
	        browserObject.manage().window().maximize();
	
	}
}