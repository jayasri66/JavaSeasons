package sendkeyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement password = driver.findElement(By.id("email"));
		password.sendKeys("8341836666");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Kakinada");
		driver.findElement(By.id("dest")).sendKeys("Hyderabad");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		
	

	}

}
