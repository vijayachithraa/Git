package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class LookUpLeadPage extends ProjectMethods{
	
	public LookUpLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
		if(!verifyTitle("Find Leads")) {
			throw new RuntimeException();
		}		
	}
	
	@FindBy(how=How.NAME,using="id")
	private WebElement eleFromLeadId;
	
	public LookUpLeadPage typeFromleadId(String data) {
		type(eleFromLeadId, data);
		return this;
	}	
		@FindBy(how=How.NAME,using="id")
		private WebElement eleToLeadId;
		
		public LookUpLeadPage typeToleadId(String data) {
			type(eleToLeadId, data);
			return this;
		
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeads;
	
	public LookUpLeadPage findLeads() {
		clickWithNoSnap(eleFindLeads);
		return this;
		
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement eleFirstResLead;
	
	public MergeLeads firstResultingLead() {
		clickWithNoSnap(eleFirstResLead);
		switchToWindow(0);
		return new MergeLeads(driver, test);
		
	}
	
	
	
	
	
	
	
	
	

}
