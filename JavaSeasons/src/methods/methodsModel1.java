package methods;

import java.util.Scanner;

public class methodsModel1 {

	public static void main(String[] args) {
		methodsModel1 obj=new methodsModel1();
		obj.natsum();
		
		
	}
public void natsum()
{
	System.out.println("Enter p value");
	Scanner obj= new Scanner(System.in);
	int n=obj.nextInt();
	int res=n*(n+1)/2;
	System.out.println(res);
	
}

}
