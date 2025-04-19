package browserlaunching;
import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AppLaunch {

	public static void main(String[] args) throws InterruptedException {

     WebDriver driver = new ChromeDriver();

        // Maximize browser window
        driver.manage().window().maximize();

 // Implicit wait
	
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Open Facebook
        driver.get("https://www.facebook.com/");
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("aravind.chowdary.549");

        // Enter password
        WebElement passwordField = driver.findElement(By.id("pass"));
        passwordField.sendKeys("Jaya@2307");

        // Click Login button
        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();
	
 Thread.sleep(60000);
	
        //driver.quit();
    }
}

