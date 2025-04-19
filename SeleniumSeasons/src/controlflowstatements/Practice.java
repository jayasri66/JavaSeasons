package controlflowstatements;

//import java.util.Random;
//import java.util.Scanner;
import java.util.*;

public class Practice {

	public static void main(String[] args) {
		//int betAmount;
		System.out.println("Guess one number");
		Scanner obj = new Scanner(System.in);
		int guessNumber = obj.nextInt();
		System.out.println("Bet amount is " );
		int betAmount = obj.nextInt();
		Random r1 = new Random();
		int randomNumber = r1.nextInt(6)+1;
		System.out.println("Roll the Dice & the number is " + randomNumber);
	
		if (guessNumber == randomNumber) {
			System.out.println("You have guessed correct number");
			System.out.println("You have won " + (betAmount * 2) +" "+" rupees "+ " Your amount is doubled");
		} else {
			System.out.println("Oh no! You have guessed wrong number. You lost the bet ");
		}

	}

}
