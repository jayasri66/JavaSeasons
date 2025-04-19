package webdrivermethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods1 {

	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	//get method
	driver.get("https://www.youtube.com/");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	//System.out.println(driver.getPageSource());
	//System.out.println(driver.getWindowHandle());
	//System.out.println(driver.getWindowHandles());
	
	driver.findElement(By.xpath("(//input[@name='search_query'])[1]")).sendKeys("aravinda sametha full movie telugu"+Keys.ENTER);
	Thread.sleep(5000);
	System.out.println(driver.findElements(By.xpath("//a[@id='thumbnail']")).size());

	driver.findElements(By.xpath("//a[@id='thumbnail']")).get(6).click();
	//driver.findElement(By.xpath("//yt-formatted-string[text()='Subscriptions']")).click();
	//close method
	//driver.close();
	
//driver.quit();
	}

}
