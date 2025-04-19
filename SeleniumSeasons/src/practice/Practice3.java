package practice;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Practice3 {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Test
	public void flipkartTest() throws InterruptedException {
//		// Close login pop-up if present
//		try {
//			WebElement closeLoginPopup = driver.findElement(By.xpath("//button[contains(text(),'✕')]"));
//			closeLoginPopup.click();
//		} catch (NoSuchElementException e) {
//			// Popup not present, continue execution
//		}

		// Search for "iPhone"
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);

		// Iterate through pages and get product names
		for (int i = 1; i <= 5; i++) { // Limiting to 5 pages for testing

			// Navigate to the next page if available
			try {
				String nextPageXPath = "//nav[@class='WSL9JP']//a[text()='" + i + "']";
				WebElement nextPage = driver.findElement(By.xpath(nextPageXPath));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();","arguments[0].click();", nextPage);
				Thread.sleep(3000);
				List<WebElement> allProductNames = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));

				// Print product names
				for (WebElement product : allProductNames) {
					System.out.println("Page " + i + ": " + product.getText());
				}
			} catch (NoSuchElementException e) {
				System.out.println("No more pages found.");
				break;
			}
		}
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}