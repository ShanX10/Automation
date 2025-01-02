package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrandNewClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		// 2. Initialize Webdriver object through ChromeDriver class.
	        ChromeDriver browserObject = new ChromeDriver();
	        
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("http://www.google.com/");
	        browserObject.findElement(By.name("q")).sendKeys("Jira");
	        browserObject.findElement(By.name("btnK")).submit();
	        
	        browserObject.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")).submit();
	        
	}

}
