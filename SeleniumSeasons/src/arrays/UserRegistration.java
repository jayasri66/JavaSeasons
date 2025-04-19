package arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserRegistration {

	public static void main(String[] args) throws InterruptedException {
	
		String[][] user=new String[2][5];
		WebDriver driver= new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.linkText("New User Register Here")).click();
		user[0][0] ="JayaSri665";
		user[0][1] ="Feb@2025";
		user[0][2] ="Feb@2025";
		user[0][3] ="JayaSre N";
		user[0][4] ="test6@yopmail.com";
		
		user[1][0] ="Test12346";
		user[1][1] ="Test1@123";
		user[1][2] ="Test1@123";
		user[1][3] ="Test1";
		user[1][4] ="test9@yopmail.com";
		
		for(int i=0;i<user.length;i++) {
			//for(int j=0;j<user[i].length;j++) {
				System.out.println(user[i]);
				
				driver.findElement(By.id("username")).sendKeys(user[i][0]);
				Thread.sleep(2000);
				driver.findElement(By.id("password")).sendKeys(user[i][1]);
				Thread.sleep(2000);
				driver.findElement(By.id("re_password")).sendKeys(user[i][2]);
				Thread.sleep(2000);
				driver.findElement(By.id("full_name")).sendKeys(user[i][3]);
				Thread.sleep(2000);
				driver.findElement(By.id("email_add")).sendKeys(user[i][4]);
				Thread.sleep(2000);
				driver.findElement(By.id("Submit")).click();	
				Thread.sleep(5000);
				driver.navigate().back();
				driver.findElement(By.linkText("New User Register Here")).click();
			}
			
		
		}
		
	}

//}
