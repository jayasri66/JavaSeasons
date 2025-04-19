package org.company;

public class CompanyInfo {

	public static void main(String[] args) {
		CompanyInfo.companyName();
	}
    public static void companyName()
    {
    	System.out.println("Company Name is XYZ");
    	companyId();
    	companyAddress();
    }
    public static void companyId()
    {
    	System.out.println("Company Id is 24512e");
    }
    public static void companyAddress()
    {
    	System.out.println("Company Address is Ameerpet, Hyderabad");
    }
}
