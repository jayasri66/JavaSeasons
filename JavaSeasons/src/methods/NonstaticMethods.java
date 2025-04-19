package methods;

public class NonstaticMethods {

	public int natSum1(int n)
	{
		int Result = n*(n+1)/2;
//		System.out.println(" Result is " + Result);	
		return Result;
	}
	public static void main(String[] args) {
	
		NonstaticMethods obj2 = new NonstaticMethods();
		System.out.println(obj2.natSum1(5));
		System.out.println(obj2.natSum1(25));
		
		
	}

}
