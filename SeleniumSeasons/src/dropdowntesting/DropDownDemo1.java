package dropdowntesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownDemo1 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
driver.get("https://www.ebay.com/");
Thread.sleep(3000);
driver.manage().window().maximize();
driver.findElement(By.name("_sacat")).sendKeys("music");
Thread.sleep(3000);
driver.findElement(By.name("_nkw")).sendKeys("telugu");
Thread.sleep(3000);
driver.findElement(By.id("gh-search-btn")).click();
Thread.sleep(3000);
driver.quit();
	}

}
