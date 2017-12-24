package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods {

	public FindLeadsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);

	}

			@FindBy(how = How.XPATH, using = "(//input[@name='firstName'])[3]")
			private WebElement elefirstname1;

			public FindLeadsPage typefName(String fName1) {
			type(elefirstname1, fName1);
			return this;
			}
			

			@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
			private WebElement eleFindleadbutton;

			public FindLeadsPage clickfindlead(){
			click(eleFindleadbutton);
			return this;
			}
			
			//Capture first resulting Lead (Duplicate lead)
			
			@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")
			private WebElement eleCaptureFirstResLead;
			
			public FindLeadsPage captureFirstResLead(String captureFirstName) {
				 captureFirstName = getText(eleCaptureFirstResLead);
				return this;
			}
			
			//Select First Resulting Lead (Duplicate lead)
			
			@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")
			private WebElement eleclickFirstLead;

			public ViewLead clickfirstleadid() throws InterruptedException{
				Thread.sleep(8000);
				clickWithNoSnap(eleclickFirstLead);
				return new ViewLead(driver, test);
			}
			
			
			@FindBy(how=How.XPATH,using="//span[text()='Email']")
			private WebElement eleEmail;
			
			public FindLeadsPage clickEmail(){
				click(eleEmail);
				return this;
			}
			
			@FindBy(how=How.XPATH,using="//input[@name='emailAddress']")
			private WebElement eleTypeEmail;
			
			public FindLeadsPage typeEmail(String Email){
			type(eleTypeEmail,Email);
			return this;
			
			}
			
			
			
				
			
			
			/*
			public ViewLead clickFirstLeadId(){
			click(firstNameElement);
			return new ViewLead(driver, test);
			}*/
			
			@FindBy(how=How.XPATH,using="//span[text()='Phone']")
			private WebElement elePhone;
			
			public FindLeadsPage clickphone(){
				click(elePhone);
				return this;
			}
			
			
			@FindBy(how=How.XPATH,using="//input[@name='phoneCountryCode']")
			private WebElement eleEnterPhone;
			
			public FindLeadsPage typephoneNum(String PNum){
				click(eleEnterPhone);
				return this;
			}
			
			//Capture First resulting id upon selecting Phone(Delete lead)
			
			@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
			private WebElement eleCaptureFirstLeadPhone;
			
			public FindLeadsPage captureFirstLeadPhone1(String CaptureFirstNamePhone){
				CaptureFirstNamePhone=getText(eleCaptureFirstLeadPhone);
				return this;
			}
			
			//Click First Resulting Lead id upon selecting Phone(Delete Lead)
			
			@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
			private WebElement eleclickFirstResLead;

			public ViewLead clickfirstleadidPhone() throws InterruptedException{
				Thread.sleep(8000);
				clickWithNoSnap(eleclickFirstResLead);
				return new ViewLead(driver, test);
			}
			
			//Enter Captured Lead id (delete Lead)
			
			@FindBy(how=How.XPATH,using= "//input[@name='id']")
			private WebElement eletypeFirstLeadId;
			
			public FindLeadsPage typeFirstleadId( String CaptureFirstNamePhone ){
			type(eletypeFirstLeadId, CaptureFirstNamePhone);
			return this;
			}
			
			
			
			
			
			
			
			
			/*
			@FindBy(how=How.XPATH,using="//div/input[@name='id']")
			private WebElement eleFromLeadIDMerge;
			
			public FindLeadsPage typefromLeadId(String MergeFromLead){
				type(eleFromLeadIDMerge, MergeFromLead);
				return this;
			
			}
			
			@FindBy(how=How.XPATH,using="//tr/td/em/button[@class='x-btn-text']")
			private WebElement eleFindLeadsMerge;
			
			public FindLeadsPage clickfindLeads(){
				click(eleFindLeadsMerge);
				return this;
			
			}
			
			@FindBy(how=How.XPATH,using="//a[@class='linktext']")
			private WebElement eleFirstResultingFromLead;
			
			public MergeLeads clickFirstResultingFromLead(){
				
			String firstNameFromMerge = eleFirstResultingFromLead.getText();
				click(eleFirstResultingFromLead);
				return new MergeLeads(driver,test);
			}
				public MergeLeads switchToPrimaryWindow(String num){
					int Primarywindow=Integer.parseInt(num);
					switchToWindow(Primarywindow);
					return new MergeLeads(driver,test);
					}
				
				@FindBy(how=How.XPATH,using="//div/input[@name='id']")
				private WebElement ToLeadIDMerge;
				
				public FindLeadsPage typeToLeadId(String MergeToLead){
					type(ToLeadIDMerge, MergeToLead);
					return this;
					
			}*/
				@FindBy(how=How.XPATH,using="//a[@class='linktext'][1]")
				private WebElement eleFirstResultingToLead;
				public MergeLeads clickFirstResultingToLead(){
					click(eleFirstResultingToLead);
					return new MergeLeads(driver,test);
				}
				@FindBy(how=How.XPATH,using="(//div[@class='x-paging-info'])[1]")
				private WebElement eleErrorMsgFindLead;
				public FindLeadsPage verifyErrorMsg(String expectedText) {
					verifyPartialText(eleErrorMsgFindLead, expectedText);
					return this;
				}
				
				
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			



			
