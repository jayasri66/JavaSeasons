package broswerlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserLaunch {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.get("https://www.facebook.com/");
		driver.get("https://www.amazon.in");
		driver.get("http://greenstech.in/selenium-course-content.html");
        driver.quit();
	}

}
