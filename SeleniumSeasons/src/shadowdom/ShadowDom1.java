package shadowdom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShadowDom1 {
WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
	driver=new ChromeDriver();	
	driver.get("https://www.salesforce.com/in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Test
	public void shadowDomTest()
	{
		WebElement shadowHost1= driver.findElement(By.xpath("//hgf-c360nav[contains(@style,'nav-integration-c-header-height')]"));
		SearchContext shadowRoot1=shadowHost1.getShadowRoot();
		WebElement textbox=shadowRoot1.findElement(By.cssSelector("header[role='banner']"));
	}
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
}
