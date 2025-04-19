package practice;
import java.util.Scanner;
public class JowarRoti {
	String water,flour;
	public void j1(String time)
	{
//System.out.println("Add 1 cup of water");
//System.out.println("Add 1 cup of flour");
		Scanner s1 = new Scanner(System.in);
		System.out.print("Add water of");
		water=s1.nextLine();
		System.out.print("Add flour of ");	
		flour=s1.nextLine();
	System.out.println("Mix water & flour together and close it with a lid");
	System.out.println("Keepit aside for" + " " + time);
	}
	public void j2(String time, String time1)
	{
	System.out.println("After" + " "+ time + " "+ "knead the dough for" + " "+ time1 + " "+ "to get a soft dough texture");
	System.out.println("Make the dough into round balls & coat the balls with plain jowar flour");
	}
	public void j3()
	{
	System.out.println("Now dust some jowar flour on the rolling board, place the ball on the board & make it into desired shape by rolling with the rolling pin");
	System.out.println("Now place the roti on the tawa and sprinkle some water on the roti to dustoff the excess flour");
	System.out.println("Cook the roti on both sides till it's perfectly cooked");
	System.out.println("Tadaaaa jowar roti is ready........");
	}
	public void j4(String a, String b)
	{
	j1(a);
	j2(a,b);
	j3();
    }
	public static void main(String args[])
	{
	JowarRoti jr =new JowarRoti();
	jr.j4("15 min", "5 min");
	}}
	
		

	
