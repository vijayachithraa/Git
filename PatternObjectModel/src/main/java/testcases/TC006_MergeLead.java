/*package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.CreateLead;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_MergeLead extends ProjectMethods{

	@BeforeClass
	public void setData() {
		dataSheetName = "TC006";
		testCaseName = "TC005_MergeLead";
		testDescription = "To Merge Lead using data from Excel";
		category= "Smoke";
		authors	="ChithraMerge";
		browserName ="chrome";
	}

	@Test(dataProvider="fetchData")
	public void MergeLeadTestCase(String userName, String passWord,String data,String Todata ) {

		try{		
			new LoginPage(driver, test)

			.enterUserName(userName)
			.enterPassword(passWord)
			.clickLogin()

			.clickcrmsfalink()
			
			.clickleadsMyhome()
			.clickMergeLeads()
			.clickiconFromLead()
			.typeFromleadId(data)
			.clickfindLeads()
			.clickWithNoSnap(firstResultingLead);
			.clickiconToLead()
			.typeToleadId(Todata)
			.clickfindLeads()
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		catch(Exception e){
			
			e.printStackTrace();
			
		}
		}
	}
			
			
			*/