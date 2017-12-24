package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.CreateLead;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_DuplicateLead extends ProjectMethods{

	@BeforeClass
	public void setData() {
		dataSheetName = "TC004";
		testCaseName = "TC004_DuplicateLead";
		testDescription = "To Duplicate Lead using data from Excel";
		category= "Smoke";
		authors	="Chithra";
		browserName ="chrome";
	}

	@Test(dataProvider="fetchData")
	public void DuplicateLeadTestCase(String userName, String passWord,String Ename,String expectedTitle,String captureFirstName ) {

		try{		
			new LoginPage(driver, test)

			.enterUserName(userName)
			.enterPassword(passWord)
			.clickLogin()

			.clickcrmsfalink()
			
			.clickleadsMyhome()
			
			.clickFindLeads()
			.clickEmail()
			.typeEmail(Ename)
			.clickfindlead()
			
			.clickfirstleadid()
			.clickDuplicateLead()
			.verifytitleDuplicateLead(expectedTitle)
			.clickCreateLead()
			.verifyDuplicateFirstName(captureFirstName);
					
			
			
			
		}
		catch(Exception e){
			
			e.printStackTrace();
			
		}
		}
}
	
			
			
			