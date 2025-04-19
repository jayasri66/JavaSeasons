package controlflowstatements;

public class Factorial {

	public static void main(String[] args) {
		int sum=1;
		for(int i=1;i<=6;i++)
		{
sum=sum*i;
	}
System.out.println("Factorial of 6 is " + sum);
}
}