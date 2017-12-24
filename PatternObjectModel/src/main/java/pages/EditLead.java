package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods{
	
	
	public EditLead(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;				
		PageFactory.initElements(driver, this);		
	
	} 
	
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement elecompanyname;
	public EditLead typeComName(String ComName) {
		type(elecompanyname, ComName);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@value='Update']")
	private WebElement clickUpdate;
	public ViewLead clickupdatelink() {
		click(clickUpdate);
		return new ViewLead(driver,test);
	}
	
}