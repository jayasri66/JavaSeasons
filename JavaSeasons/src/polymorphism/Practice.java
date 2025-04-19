package polymorphism;

import java.util.Scanner;

public class Practice {

	int studentId;
	String studentName;
	int marks1,marks2,marks3,marks4,marks5,marks6,total,average;
	//double average;
public void studentDetails()
{
	Scanner s1=new Scanner(System.in);
	System.out.println("enter studentid " );
	studentId=s1.nextInt();
	System.out.println("enter student name " );
	s1.next();
	studentName=s1.nextLine();
    System.out.println("enter marks1 " );
	marks1=s1.nextInt();
	System.out.println("enter marks2" );
	marks2=s1.nextInt();
	System.out.println("enter marks3 " );
	marks3=s1.nextInt();
	System.out.println("enter marks4 " );
	marks4=s1.nextInt();
	System.out.println("enter marks5 " );
	marks5=s1.nextInt();
	System.out.println("enter marks6 " );
	marks6=s1.nextInt();
	total = marks1+marks2+marks3+marks4+marks5+marks6;
	System.out.println(total);
	//average = total/6;
	double average = total/6;
	System.out.println("Average is " + average );
	
}
public static void main(String args[])
{
	Practice p1 = new Practice();
	p1.studentDetails();
}
}