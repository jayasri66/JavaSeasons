package controlflowstatements;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class forIfElse3 {
	public static void main(String[] args) {
int i;
		Scanner input = new Scanner(System.in);
		for(i=1; i<=3;i++) {
		int fan = input.nextInt();
		if (fan==1) {
			System.out.println("Fan turned on");
		} else if(fan==2) {
			System.out.println("Fan turned off");
		}else {
	System.out.println("invalid data");}}}
}