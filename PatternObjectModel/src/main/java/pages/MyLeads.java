package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods{

	public MyLeads(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;				
		PageFactory.initElements(driver, this);		

	}

	@FindBy(how=How.XPATH,using="//a[text()='Create Lead']")
	private WebElement eleforclick;
	public CreateLead clickcreateLeadslink() {
		click(eleforclick);
		return new CreateLead(driver, test);
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Find Leads']")
	private WebElement eleforFindLeadClick;
	public FindLeadsPage clickFindLeads(){
		click(eleforFindLeadClick);
		return new FindLeadsPage(driver,test);
		
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	private WebElement eleCapturedLeadId;
	public MyLeads CapturedLeadId(String expectedText){
	verifyExactText(eleCapturedLeadId, expectedText);
	return this;	
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='x-paging-info']")
	private WebElement ErrormsgElement;
	public MyLeads VerifyErrorMsg(String expectedText ){
		verifyExactText(ErrormsgElement, expectedText);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Merge Leads']")
	private WebElement clickMergeLeads;
	public MergeLeads clickMergeLeads(){
		click(clickMergeLeads);
		return new MergeLeads(driver,test);
	}
	
	
	
	
	
}


