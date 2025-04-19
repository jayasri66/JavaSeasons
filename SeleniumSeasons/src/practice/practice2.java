package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice2 {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://emicalculator.net/");
        driver.manage().window().maximize();
        Actions action = new Actions(driver);
        Thread.sleep(2000);
        WebElement src = driver.findElement(By.xpath("//div[contains(@id,'loaninterestslider')]//span"));
        Thread.sleep(3000);
//        WebElement desc = driver.findElement(By.xpath("//div[contains(@id,'loanTenureValueSlider')]//label[@style='left: 66.6667%;']"));
//        action.dragAndDrop(src,desc).build().perform();
        double i= Double.parseDouble(driver.findElement(By.xpath("//input[contains(@id,'loaninterest')]")).getAttribute("value"));
        while(i< 14.50){
        action.clickAndHold(src).moveByOffset(20, 0).release().perform();
        Thread.sleep(1000);
        i= Double.parseDouble(driver.findElement(By.xpath("//input[contains(@id,'loaninterest')]")).getAttribute("value"));
        }
        driver.quit();
    }

}
