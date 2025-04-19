package controlflowstatements;

public class Patterns {

	public static void main(String[] args) {
		/*for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println("=================");
		// Triangle
		for (int j = 0; j < 6; j++) {
			int k = 0;
			for (int i = 5; i >= j; i--) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}
		System.out.println("=================");
		for (int j = 0; j < 6; j++) {
			int k = 0;
			for (int i = 0; i <= j; i++) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}
		System.out.println("=================");
		int a = 1;
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print(a + " ");
				a++;
			}
			System.out.println();
		}
		System.out.println("=================");
		int k = 1;
		for (int j = 0; j < 6; j++) {
			for (int i = 0; i <= j; i++) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}
		
		for (int j = 0; j < 6; j++) {
			for (int i = 5; i >= j; i--) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}
		*/System.out.println("=================");
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<5;j++)
		{
			if(i==0 || i==4 ||j==0 ||j==4)
			{
			System.out.print(" * ");
		} 
			else {
				System.out.print("    ");
			}
	}
		System.out.println();
	}
	System.out.println("=================");
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<5;j++)
		{
			if(i==j)
			{
			System.out.print(" * ");
		} 
			else {
				System.out.print("    ");
			}
	}
		System.out.println();
	}
	System.out.println("=================");
	for(int j=0;j<5;j++)
	{
		for(int i=0;i<5;i++)
		{
			//if((i==0 && j==0) ||(i==1 && j==0) || i==2 ||(i==3 && j==4) ||(i==4 && j==4))
			if((i==0 && j==0) || (i==0 && j==1) || j==2 ||(i==4 && j==3) ||(i==4 && j==4))
			{
			System.out.print(" * ");
		} 
			else {
				System.out.print("    ");
			}
	}
		System.out.println();
	}
	System.out.println("=================");
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<5;j++)
		{
			if(i==0 || i==4 ||j==0 ||j==4)
			{
			System.out.print("   ");
		} 
			else {
				System.out.print(" * ");
			}
	}
		System.out.println();
	}
	System.out.println("=================");
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<5-i;j++)
		{
		//if(i==0||j==0||(i==1 && j==1)||(i==1 && j==2)||(i==1 &&j==3)||(i==2 && j==1)||(i==2 && j==2)||(i==3 && j==1))
			//if(i==0||j==0||(i==1 && j!=4) ||(i==2 && j!=3 && j!=4)||(i==3 && j!=2 && j!=3 && j!=4)||(i==4&& j!=1 && j!=2 && j!=3 && j!=4))
			//{
			System.out.print(" *  ");
		} 
			//else {
				System.out.println("  ");
	}
	
		//System.out.println();
	//}
	//}

System.out.println("=================");
for(int i=0;i<5;i++)
{
	for(int j=0;j<5;j++)
	{
if((i==0 && j==0) || (i==0 && j==1) ||(i==0 && j==2) || (i==1 && j==0) ||
	(i==1 && j==1) || (i==2 && j==0)||(i==2 && j==4)||(i==3 && j==3)||(i==3 && j==4)||(i==4 && j==2)||(i==4 && j==3)||(i==4 && j==4))
		{
		System.out.print(" * ");
	} 
		else {
			System.out.print("  ");
		}
} 
	System.out.println();
	}

			}}
		