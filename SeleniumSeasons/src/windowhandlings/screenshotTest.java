package windowhandlings;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.out.println(System.getProperty("user.dir"));
		File srcFile = null;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(5000);
		List<WebElement> footerIconList = driver
				.findElements(By.xpath("//div[contains(@class,'footer-icons')]//span/a"));

		for (WebElement footerIcon : footerIconList) {
			String parentWindow = driver.getWindowHandle();

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", footerIcon);
			footerIcon.click();
			Thread.sleep(3000);
			Set<String> allWindowsPresentAfterClicking = driver.getWindowHandles();
			for (String s : allWindowsPresentAfterClicking) {
				if (!s.equals(parentWindow)) {
					driver.switchTo().window(s);

					srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		            System.out.println(driver.getTitle());
					System.out.println(driver.getCurrentUrl());
					System.out.println("----------------------------------");
					driver.close();
				}
			}
			driver.switchTo().window(parentWindow);
			FileUtils.copyFile(srcFile,
					new File(System.getProperty("user.dir") + footerIcon.getAttribute("alt") + ".png"));

		}

		driver.quit();
	}

}
