package polymorphism;

public class Assignment2 {

	String panCard, voterId,passport;
	public void setAadhar(String panCard)
	{
		this.panCard=panCard;
	}
	public void setAadhar(String panCard, String voterId)
	{
		this.panCard=panCard;
		this.voterId=voterId;
	}
	public void setAadhar(String panCard, String voterId, String passport)
	{
		this.panCard=panCard;
		this.voterId=voterId;
		this.passport=passport;
	}
	public void getAadhar()
	{
System.out.println("Aadhar number with pancard is" + " "+ " "  + (int)(Math.random()*10000)
				+" " + (int)(Math.random()*10000)+" " + (int)(Math.random()*10000));
System.out.println("Aadhar number with pancard & VOTERID is" + " "+ panCard +", "+ voterId +" "  + (int)(Math.random()*10000)
				+" " + (int)(Math.random()*10000)+" " + (int)(Math.random()*10000));
	}
}
