package controlflowstatements;

public class EvenOddNumbers {

	public static void main(String[] args) {
		//int sum = 0;
		//int sum1 = 0;
		for (int j = 1; j <= 100; j++) {
			if (j % 2 == 1) {
			//	sum = sum + j;
				
				System.out.println(j + " ");
				
			}
		}
			//System.out.println("Sum of odd numbers is " + sum);
		for (int j = 1; j <= 100; j++) {
			if (j % 2 == 0) {
				//sum1 = sum1 + j;
			System.out.println("Even number " + j);

			}
		
		}
		//System.out.println("Sum of even numbers is " + sum1);
	}
	}
