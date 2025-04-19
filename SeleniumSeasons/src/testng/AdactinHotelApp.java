package testng;
import org.testng.Assert;
import org.testng.annotations.*;
public class AdactinHotelApp {
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("I'm at Adactin hotel class ");
		}
	@BeforeClass
	public void beforeClass1()
	{
		System.out.println("I'm at Adactin hotel class1 ");
		}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("I'm before test class ");	
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("I'm at the end of the class");
	}
	@BeforeMethod
	public void setUp()
	{
		System.out.println("Browser Started ..");
		System.out.println("App Launched ..");
	}
	
	@AfterMethod
	public void teardown()
	{
		System.out.println("Browser closed ..");
	}
	
	@Test(priority=2)
	public void loginTest()
	{
		
		Assert.assertTrue(true);
		System.out.println("Login successfull..");
		
		
	}
	
	@Test(priority=0)
	public void registrationTest()
	{
		
		System.out.println("Registration successfull..");
		
		
	}
	
	@Test(priority=3)
	public void forgotPasswordTest()
	{
		
		System.out.println("Forgot Password successfull..");
			
	}
	
	@Test(priority=4,dependsOnMethods="loginTest")
	public void changePasswordTest()
	{
		
		System.out.println("Change Password successfull..");
		
		
	}
	
	

}