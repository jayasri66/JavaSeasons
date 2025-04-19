package methods;
class Assignment
{
	int studentNo =0;
public static void main( String args[])
{
	Assignment obh= new Assignment();
obh.student1("qwer","006","8th");
obh.student1("asdf","008","9th");
obh.student1("ghjj","009","9th");
obh.student1("lhkj","10","7th");
obh.student1("kinm","16","10th");
}

public void student1(String studentName,String rollNo,String Class)

{
  
System.out.println("Student Number" +" "+ (++studentNo));
System.out.println("Student Name is " + studentName);
System.out.println("Roll No is " + rollNo);
System.out.println("Class :" + Class);
System.out.println("****************************");
}}
