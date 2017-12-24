package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class DuplicateLead extends ProjectMethods{
	
	
	public DuplicateLead(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;				
		PageFactory.initElements(driver, this);		
	
	} 
	

	//title duplicate lead
	@FindBy(how=How.XPATH,using="//a[text()='Duplicate Lead']")
	private WebElement titleDuplicateLead;
	public DuplicateLead verifytitleDuplicateLead(String expectedTitle){
		verifyTitle(expectedTitle);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@value='Create Lead']")
	private WebElement clickCreateLead;
	public ViewLead clickCreateLead(){
		click(clickCreateLead);
		return new ViewLead(driver,test);
	}
			
	
}

	