package controlflowstatements;

public class Factors {

	public static void main(String[] args) {
		System.out.println("This number is divisible by 3 & 6 " );
		for(int i=1;i<=100;i++)
		{
			if(i%3==0 && i%6==0) {
				
				System.out.println(i);
			}
		}

	}

}
