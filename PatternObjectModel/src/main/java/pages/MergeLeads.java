package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MergeLeads extends ProjectMethods {
	
	public MergeLeads(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;				
		PageFactory.initElements(driver, this);		
		if(!verifyTitle("Merge Leads | opentaps CRM")) {
			throw new RuntimeException();
		}
}
	

	@FindBy(how=How.XPATH,using="//img[@alt='Lookup']")
	private WebElement eleIconFromLead;
	
	public LookUpLeadPage iconFromLead() {
		click(eleIconFromLead);
		switchToWindow(1);
		return new LookUpLeadPage(driver, test);
		
	}
	
	@FindBy(how=How.XPATH,using="(//img[@alt='Lookup'])[2]")
	private WebElement eleIconToLead;
	
	public LookUpLeadPage iconToLead() {
		clickWithNoSnap(eleIconToLead);
		switchToWindow(1);
		return new LookUpLeadPage(driver, test);
		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge")
	private WebElement eleMerge;
	
	public ViewLead mergeButton() {
		clickWithNoSnap(eleMerge);
		acceptAlert();
		return new ViewLead(driver, test);
		
	}
}
	



	/*
	public FindLeadsPage switchToNewWindow(String num){
		int window=Integer.parseInt(num);
		switchToWindow(window);
		return new FindLeadsPage(driver,test);
		}
	
	@FindBy(how=How.XPATH,using="(//img[@alt='Lookup'])[2]")
	private WebElement eleToLeadId;
	public FindLeadsPage clickToLeadId(){
		click(eleToLeadId);
		return new FindLeadsPage(driver,test);
	}
	@FindBy(how=How.XPATH,using="//a[@class='buttonDangerous']")
	private WebElement eleClickMerge;
	public MergeLeads clickMerge(){
		click(eleClickMerge);
		return this;
	}
		public void acceptAlert(){
		acceptAlert;
	}
		
	

	

	*/
	
		
		
		
		
		
		
	
	
	
	


