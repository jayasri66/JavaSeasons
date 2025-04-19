package linkstesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTestingDemo1 {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	List<WebElement> links=driver.findElements(By.xpath("//a[contains(@href,'/')]"));
	System.out.println("No. of links  " + links.size());
	for(int i=0;i<links.size();i++)
	{
		System.out.println(i+" ===> " + links.get(i).getAttribute("href"));
		System.out.println(i+" ===> " + links.get(i).getText());
	}
	
//driver.quit();
	}

}
