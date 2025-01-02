package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Github {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
	        ChromeDriver browserObject = new ChromeDriver();
	        browserObject.get("http://www.google.com/");
	        
	        browserObject.findElement(By.name("q")).sendKeys("Selenium Python");

	}

}
