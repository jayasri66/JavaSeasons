package controlflowstatements;

import java.util.Scanner;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Switch {
	public static void main(String[] args) {
		System.out.println("Enter browser name");
		Scanner input = new Scanner(System.in);
		int browser = input.nextInt();
		// String browser = input.next();
		switch (browser) {
		case 1:
			// case "Chrome":
			new ChromeDriver();
			break;
		case 2:
			// case "Edge":
			new EdgeDriver();
			break;
		default:
			System.out.println("Data Invalid");
		}

	}

}
