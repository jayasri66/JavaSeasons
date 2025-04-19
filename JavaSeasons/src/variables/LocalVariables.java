package variables;

public class LocalVariables {

	
	public static void main(String[] args) {
	
		int x = 12;
		int y=10;
		//System.out.println(x);==> The local variable x may not have been initialized
		InstanceVariables obj= new InstanceVariables();
		
		System.out.println("x value" + " is " + x);
		System.out.println(y);
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(StaticVariables.f);
	
		LocalVariables obj1= new LocalVariables();
		obj1.m1();
	}

	public void m1()
	{
		int z=20;
		System.out.println("Z value is " + z);
	}
}
