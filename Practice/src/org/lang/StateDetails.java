package org.lang;

public class StateDetails {

	public static void main(String[] args) {
		
		StateDetails stateDetails=new StateDetails();
		LanguageInfo langInfo = new LanguageInfo();
		stateDetails.southIndia();
		stateDetails.northIndia();
		langInfo.hindiLanguage();
		langInfo.englishLanguage();
		langInfo.teluguLanguage();
	}
public void southIndia()
{
	System.out.println("Telugu is one of the south Indian language");
}
public void northIndia()
{
	System.out.println("Hindi is one of the north Indian language");
}
}
