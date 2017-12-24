package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.CreateLead;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLead extends ProjectMethods{



	@BeforeClass
	public void setData() {
		dataSheetName = "TC005";
		testCaseName = "TC005_DeleteLead";
		testDescription = "To Delete Lead using data from Excel";
		category= "Smoke";
		authors	="Chithra1";
		browserName ="chrome";
	}

	@Test(dataProvider="fetchData")
	public void DeleteLeadTestCase(String userName, String passWord,String pname,String CaptureFirstNamePhone ,String errorMsg) {

		try{		
			new LoginPage(driver, test)

			.enterUserName(userName)
			.enterPassword(passWord)
			.clickLogin()

			.clickcrmsfalink()
			
			.clickleadsMyhome()
			
			.clickFindLeads()
			.clickphone()
			.typephoneNum(pname)
			.clickfindlead()
			.clickfirstleadidPhone()
			.clickDeleteLead()
			.clickFindLeads()
			.typeFirstleadId( CaptureFirstNamePhone)
			.clickfindlead()
			.verifyErrorMsg(errorMsg);
			
			
			
			
			
		}
		catch(Exception e){
			
			e.printStackTrace();
			
		}
		}
	}
			
			
			