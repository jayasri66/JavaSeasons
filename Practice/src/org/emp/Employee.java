package org.emp;

import org.add.GreensTech;
import org.company.CompanyInfo;
import org.lang.LanguageInfo;
import org.lang.StateDetails;
import org.phone.PhoneInfo;

public class Employee {

	public static void main(String[] args) {
		Employee emp=new Employee();
		GreensTech greentech = new GreensTech();
		//CompanyInfo companyInfo= new CompanyInfo();
		StateDetails stateDetails=new StateDetails();
		LanguageInfo langInfo = new LanguageInfo();
		PhoneInfo phoneInfo=new PhoneInfo();
		
		emp.empId();
		greentech.greensOmr();
		greentech.greensAdayar();
        greentech.greensTambaram();
		greentech.greensVelacherry();
		greentech.greensAnnanagar();
		CompanyInfo.companyName();
		stateDetails.southIndia();
		stateDetails.northIndia();
		langInfo.hindiLanguage();
		langInfo.englishLanguage();
		langInfo.teluguLanguage();
		phoneInfo.phoneName();
		phoneInfo.phoneMieiNum();
		phoneInfo.camera();
		phoneInfo.storage();
		phoneInfo.osName();

	}

	public void empId()
	{
		System.out.println("EmpId is 2356");
		empName();
		empDob();
		empPhone();
		empEmail();
		empAddress();
	}
	public void empName()
	{
		System.out.println("EmpName is Jaya Sri");
	}
	public void empDob()
	{
		System.out.println("EmpDob is 23rd July 1996");
	}
	public void empPhone()
	{
		System.out.println("EmpPhone is 9574235421");
	}
	public void empEmail()
	{
		System.out.println("EmpEamil is knjsr@gmail.com");
	}
	public void empAddress()
	{
		System.out.println("EmpAddress is Hyderabad");
	}
}
