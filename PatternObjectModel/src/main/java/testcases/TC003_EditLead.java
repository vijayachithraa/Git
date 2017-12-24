package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.CreateLead;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_EditLead extends ProjectMethods{

	@BeforeClass
	public void setData() {
		dataSheetName = "TC004_editLead";
		testCaseName = "TC004_EditLead";
		testDescription = "To edit Lead using data from Excel";
		category= "Smoke";
		authors	="Danvanth";
		browserName ="chrome";
	}

	@Test(dataProvider="fetchData")
	public void editLeadTestCase(String userName, String passWord,String fName1,String expectedTitle, String ComName ) {

		try{		
			new LoginPage(driver, test)

			.enterUserName(userName)
			.enterPassword(passWord)
			.clickLogin()

			.clickcrmsfalink()
			
			.clickleadsMyhome()
			
			.clickFindLeads()
			
			.typefName(fName1)
			.clickfindlead()
			.clickfirstleadid()
			.verifytitleViewLead(expectedTitle)
			
			.clickEditLead()
			.typeComName(ComName)
			.clickupdatelink()
			
			.verifyviewleadCompname(fName1);
			
			
		}
		catch(Exception e){
			
			e.printStackTrace();
			
		}
		}
	}
