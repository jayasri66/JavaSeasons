package homework;

public class EmployeeData2  {
	int mobileNumber;
	int empId;
	String email;
	String empName;
	public EmployeeData2(int mobileNumber,int empId,String email,String empName)
	{
		this.mobileNumber = mobileNumber;
        this.empId = empId;
        this.email = email;
        this.empName = empName;
	}
	public void displayEmployeeData()
	{
        System.out.println("Employee Name " + empName);
    	System.out.println("Employee Id " + empId);
    	System.out.println("Employee Email " + email);
    	System.out.println("Employee MobileNumber " + mobileNumber);
	}

}
