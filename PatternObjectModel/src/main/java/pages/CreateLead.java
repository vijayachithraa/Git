package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	
	
	public CreateLead(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;				
		PageFactory.initElements(driver, this);		
	
	} 
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement elefirstname;
	public CreateLead typefName(String fName) {
		type(elefirstname, fName);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement elelastname;
	public CreateLead typelName(String lName) {
		type(elelastname, lName);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement elecompname;
	public CreateLead typecName(String cName) {
		type(elecompname, cName);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_industryEnumId")
	private WebElement eleindustrydropdown;
	
	public CreateLead selectindustrydropdown(String indusName){
		selectDropDownUsingText(eleindustrydropdown,indusName );
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_marketingCampaignId")
	private WebElement elemarketingdropdown;
	
	public CreateLead selectmarketingdropdown(String num){
		int mdp=Integer.parseInt(num);
		selectDropDownUsingIndex(elemarketingdropdown, mdp);
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@name='submitButton']")
	private WebElement elecreateleadbutton;
	public ViewLead clickcreatelead(){
		click(elecreateleadbutton);
		return new ViewLead(driver, test);
	}
	
	

}
