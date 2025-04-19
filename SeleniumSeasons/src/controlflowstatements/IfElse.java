package controlflowstatements;

import java.util.Scanner; 

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class IfElse {
	public static void main(String[] args) {

		System.out.println("Enter browser name");
		Scanner obj = new Scanner(System.in);
		String browser = obj.next();

		if (browser.equals("Chrome")) {
			new ChromeDriver();
		} else if (browser.equals("Edge")) {
			new EdgeDriver();
		} else {
			System.out.println("Data Invalid");
		}
	}
}