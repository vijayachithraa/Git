package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{
	
	public ViewLead(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;				
		PageFactory.initElements(driver, this);		
	
	}  
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement elefnameview;
	public ViewLead verifyfirstnameviewlead(String fName) {
		verifyExactText(elefnameview, fName);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//div[text()='View Lead']")
	private WebElement eletitleViewLead;
	public ViewLead verifytitleViewLead(String expectedTitle){
		verifyTitle(expectedTitle);
		return this;
				
}
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement viewleadCompname;
	
	public ViewLead verifyviewleadCompname(String fName1){
		verifyPartialText(viewleadCompname, fName1);
		return this;
		
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Duplicate Lead']")
	private WebElement clickDuplicateLead;
	public DuplicateLead clickDuplicateLead(){
		click(clickDuplicateLead);
		return new DuplicateLead(driver,test);
	}
	
	@FindBy(how=How.XPATH,using="viewLead_firstName_sp")
	private WebElement verifyduplicateName;
	public ViewLead verifyDuplicateFirstName(String expectedText){
		verifyExactText(verifyduplicateName, expectedText);
		return this;
	}
	
	//Edit click
	
	@FindBy(how=How.XPATH,using="////a[text()='Edit']")
	private WebElement clickEditLead;
	public EditLead clickEditLead(){
		click(clickEditLead);
		return new EditLead(driver,test);
	}
	
	//Delete CLick
	
	@FindBy(how=How.XPATH,using="////a[text()='Delete']")
	private WebElement clickDeleteLead;
	public MyLeads clickDeleteLead(){
		click(clickDeleteLead);
		return new MyLeads(driver,test);		
}
	@FindBy(how=How.XPATH,using="//a[text()='Find Leads']")
	private WebElement eleClickFindLeads;
	public FindLeadsPage clickFindLeads(){
		click(eleClickFindLeads);
		return new FindLeadsPage(driver,test);
	}
	
	
}
	


