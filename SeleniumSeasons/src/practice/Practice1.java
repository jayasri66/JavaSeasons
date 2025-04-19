package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice1 {
	WebDriver driver;
@BeforeMethod
public void setUP()
{
    driver = new ChromeDriver();
    driver.get("https://homeloans.sbi/calculators");
    driver.manage().window().maximize();
}
@Test
public void dragAndDrop1() throws InterruptedException
{
	Actions action = new Actions(driver);
    Thread.sleep(2000);
    WebElement src = driver.findElement(By.xpath("//div[contains(@id,'loanTenureValueSlider')]//span"));
    Thread.sleep(3000);
    //WebElement desc = driver.findElement(By.xpath("//div[contains(@id,'loanTenureValueSlider')]//label[@style='left: 66.6667%;']"));
    WebElement desc = driver.findElement(By.xpath("//div[@id='loanTenureValueSlider_DEFAULTEMICAL']/child::label[@style='left: 83.3333%;']"));
   action.dragAndDrop(src,desc).build().perform();
  
}
@AfterMethod
public void tearDown() throws InterruptedException
{
	Thread.sleep(3000);
	driver.quit();
}
}
