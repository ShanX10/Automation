package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// 2. Initialize WebDriver object through ChromeDriver class.
		ChromeDriver browserObject = new ChromeDriver();
	      
		// 3. In Explicit Wait we will use WebDriverWait class .This class object is created and the the browserObject and time is intialized to the object
		// Explicit Wait is applied to element in the webpage
		Wait<WebDriver> wait = new WebDriverWait(browserObject, Duration.ofSeconds(2));
	     
	     // 4.  Open the web page https://www.google.com/
	      browserObject.get("http://google.com" );
	      //Maximizes the browser window
	     
	      WebElement gmailLink;
		// 5. Locate the gmail element and apply the wait and until method to the element.
	      gmailLink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//a[contains(text(),'Gmail')]")));
	      gmailLink.click();


	}

}
