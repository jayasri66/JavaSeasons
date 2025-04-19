package windowhandlings;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class multipleWindowHandling1 {
	WebDriver driver;
@BeforeMethod
public void setUP()
{
	 driver= new ChromeDriver();
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.manage().window().maximize();
}
@Test
public void windowHandle() throws InterruptedException
{
	String homeWindow=driver.getWindowHandle();
	driver.findElement(By.xpath("//a[@href='https://www.facebook.com/IRCTCofficial/']")).click();
	switchToWindow("IRCTC | New Delhi  | Facebook");
	driver.close();
	Thread.sleep(3000);
	driver.switchTo().window(homeWindow);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//img[contains(@src,'irctc-whatsapp')]")).click();
	switchToWindow("IRCTC Official | WhatsApp Channel");
	Thread.sleep(3000);
	driver.switchTo().window(homeWindow);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@href='https://youtube.com/c/IRCTCOFFICIAL']")).click();
	switchToWindow("IRCTC OFFICIAL - YouTube");
	Thread.sleep(3000);
	driver.switchTo().window(homeWindow);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[contains(@href,'instagram.com')]")).click();
	switchToWindow("IRCTC (@irctc.official) • Instagram photos and videos");
	Thread.sleep(3000);
	driver.switchTo().window(homeWindow);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/irctcofficial']")).click();
	switchToWindow("Sign Up | LinkedIn");
	Thread.sleep(3000);
	driver.switchTo().window(homeWindow);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//i[@class='fa fa-telegram']/parent::a")).click();
	switchToWindow("Telegram: Contact @IRCTC_Official");
	Thread.sleep(3000);
	driver.switchTo().window(homeWindow);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@href='https://in.pinterest.com/irctcofficial/']")).click();
	switchToWindow("IRCTC Tourism (irctcofficial) - Profile | Pinterest");
	Thread.sleep(3000);
	driver.switchTo().window(homeWindow);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@href='https://irctcofficial.tumblr.com/']")).click();
	switchToWindow("@irctcofficial on Tumblr");
	Thread.sleep(3000);
	driver.switchTo().window(homeWindow);
	Thread.sleep(3000);
	
	//driver.findElement(By.xpath("//img[contains(@src,'images/Koo.png')]")).click();
	//Thread.sleep(3000);
	//driver.findElement(By.xpath("//a[@href='https://twitter.com/IRCTCofficial']")).click();

}
public void switchToWindow(String Title)
{
	Set<String> allWindowHandles=driver.getWindowHandles();
	Iterator<String> it=allWindowHandles.iterator();
	while(it.hasNext())
	{
		driver.switchTo().window(it.next());
		
		if(driver.getTitle().equals(Title))
		{
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println("------------------------------");
			break;
		}
		
	}
	
}
@AfterMethod
public void tearDown() throws InterruptedException
{
	Thread.sleep(3000);
driver.quit();
}
}
