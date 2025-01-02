package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class OpenChrome {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

        // Initialize WebDriver object
        WebDriver browser = new ChromeDriver();

        try {
            // Set an implicit wait (optional, ensures elements are loaded before interaction)
            browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // Open Google
            browser.get("http://www.google.com/");

            // Search for "Jira"
            browser.findElement(By.name("q")).sendKeys("Jira");
            browser.findElement(By.name("btnK")).submit();

            // Click on the first result (ensure the XPath is up-to-date)
            browser.findElement(By.xpath("//div[@id='rso']//a/h3")).click();

        } catch (Exception e) {
            // Log any errors that occur during execution
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Close the browser to clean up resources
            browser.quit();
        }
    }
}
