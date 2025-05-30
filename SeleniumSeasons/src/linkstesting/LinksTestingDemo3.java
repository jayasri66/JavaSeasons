package linkstesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTestingDemo3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// WebElement block=driver.findElement(By.xpath("//div[text()='CONSUMER
		// POLICY']/parent::div"));
		List<WebElement> links = driver.findElements(By.xpath("//div[text() ='HELP']/parent::div//a"));
		System.out.println("No. of links  " + links.size());
		for (int i = 0; i < links.size(); i++) {

			System.out.println(links.get(i).getText());
			links.get(i).click();
			Thread.sleep(2000);
			System.out.println(driver.getCurrentUrl());
			System.out.println("--------------------------------");
			driver.navigate().back();
			Thread.sleep(2000);
			links = driver.findElements(By.xpath("//div[text() ='HELP']/parent::div//a"));
		}

//driver.quit();
	}

}
