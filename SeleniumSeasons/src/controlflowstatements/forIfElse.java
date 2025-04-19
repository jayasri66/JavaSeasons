package controlflowstatements;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class forIfElse {
	public static void main(String[] args) {
		int i;
		System.out.println("Enter browser name");
		Scanner obj = new Scanner(System.in);

		for (i = 0; i < 3; i++) {
			//String browser = obj.next();
			int browser = obj.nextInt();
			if (browser==1) {
				new ChromeDriver();
			} else if (browser==2) {
				new EdgeDriver();
			} else if (browser==3) {
				new FirefoxDriver();
			} else {
				System.out.println("Data Invalid");
			}
		}
	}
}