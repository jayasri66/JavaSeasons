package controlflowstatements;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
   Scanner Sc= new Scanner(System.in);
	int maxMarks=0, minMarks=100;
	for(int i=0;i<5;i++) {
	System.out.println("marks of student" + (i+1));
	int Marks=Sc.nextInt();	
	if(Marks>maxMarks){
		maxMarks=Marks;
	}
	if(Marks<minMarks) {
		minMarks=Marks;
	}
	}
	System.out.println("Maximum Marks is" + maxMarks);
	System.out.println("Minimum Marks is" + minMarks);
	}
	}
