package browserlaunching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
driver.get("https://adactinhotelapp.com/");
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	e.printStackTrace();
}
driver.get("https://www.facebook.com/");
//driver.close();
	}

}
