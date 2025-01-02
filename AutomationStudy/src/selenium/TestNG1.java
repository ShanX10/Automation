package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNG1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		ChromeDriver  browserObject = new ChromeDriver();
		//Enter the URL http://demo.itlearn360.com
		browserObject.get("http://demo.itlearn360.com/");
		
		//Maximize window
		browserObject.manage().window().maximize() ;
		
		//Wait
		Thread.sleep(2000);
		 
		//Click on login button
		WebElement element = browserObject.findElement(By.id("loginlabel"));
	
		//click Button
		element.click();
		
		//Wait 
		Thread.sleep(2000);
		
		//Locate Username box
		WebElement username = browserObject .findElement(By.id("user_login"));
		
		//Wait
		Thread.sleep(2000);
		
		//Type Demo12 in username box
		username.sendKeys("Demo12");
		
		//Locate Password box
		WebElement password = browserObject .findElement(By.id("user_pass"));
		
		//Print password in password box
		password.sendKeys("Test123456$");
		
		//Locate login button 
		WebElement login = browserObject.findElement(By.id("wp-submit"));
		
		//Click login button
		login.click();
		
		//Locate Search box
		WebElement search = browserObject.findElement(By.id("search_course"));
		
		//Search Automation in search box
		search.sendKeys("Automation");
		
		search.submit();
		
		//Wait
		Thread.sleep(2000);
					

	}

}
