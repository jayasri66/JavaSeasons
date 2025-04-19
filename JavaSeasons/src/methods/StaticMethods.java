package methods;

public class StaticMethods {

	public static void natSum1(int n)
	{
		int Result = n*(n+1)/2;
		System.out.println(" Result is " + Result);	
	}
	public static void main(String[] args) {

		StaticMethods.natSum1(5);
		
		StaticMethods.natSum1(25);
		
		
	}

}
