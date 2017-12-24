package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.CreateLead;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{

	@BeforeClass
	public void setData() {
		dataSheetName = "TC003";
		testCaseName = "TC003_CreateLead";
		testDescription = "To Create Lead using data from Excel";
		category= "Smoke";
		authors	="Vijaya chitra";
		browserName ="chrome";
	}

	@Test(dataProvider="fetchData")
	public void createLeadTestCase(String userName, String passWord,String fName,String lName,String cName,String indusName,String num) {

		try{		
			new LoginPage(driver, test)

			.enterUserName(userName)
			.enterPassword(passWord)
			.clickLogin()

			.clickcrmsfalink()


			.clickleadsMyhome()

			.clickcreateLeadslink()

			.typefName(fName)
			.typelName(lName)
			.typecName(cName)
			.selectindustrydropdown(indusName)
			.selectmarketingdropdown(num)
			.clickcreatelead()
			.verifyfirstnameviewlead(fName);
			
		}
		catch(Exception e){
			
			e.printStackTrace();
			
		}
		}
	}
