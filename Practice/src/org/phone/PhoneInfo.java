package org.phone;

public class PhoneInfo {

	public static void main(String[] args) {
		PhoneInfo phoneInfo=new PhoneInfo();
		phoneInfo.phoneName();
		phoneInfo.phoneMieiNum();
		phoneInfo.camera();
		phoneInfo.storage();
		phoneInfo.osName();
	}
	public void phoneName()
	{
		System.out.println("Phone name Samsung A53");
	}
	public void phoneMieiNum()
	{
		System.out.println("Phone MieiNum 457812396582");
	}
	public void camera()
	{
		System.out.println("12MP ");
	}
	public void storage()
	{
		System.out.println("256GB");
	}
	public void osName()
	{
		System.out.println("Android");
	}

}
