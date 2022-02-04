package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SignUpPage {

	public WebDriver driver;
	
	By tryForFree= By.xpath("//a[@id='signup_link']");
	By fName=By.xpath("//input[@id=\'UserFirstName-Qn5M\']");
	By lName=By.xpath("//input[@id='UserLastName-1zC1']");
	By workEmail=By.xpath("//input[@id='UserEmail-2Qhn']");
	By jobTitle=By.xpath("//select[@id='UserTitle-3Jy3']");
	By company=By.xpath("//input[@id='CompanyName-VPyu']");
	By employee=By.xpath("//select[@id='CompanyEmployees-cvhb']");
	By phone=By.xpath("//input[@id='UserPhone-BLZF']");
	By lang=By.xpath("//select[@id='CompanyLanguage-uaje']");
	By Iagree=By.xpath("//div[@id='SubscriptionAgreement-C60v-cbxLbl']");
	By SignUpbutton=By.xpath("//button[@name='Start my free trial']");
	
	
	
	
	public SignUpPage(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement clickOnFreetry()
	{
		 return driver.findElement(tryForFree);
	}
	
	public WebElement enterFname()
	{
		 return driver.findElement(fName);
	}
	
	public WebElement enterLname()
	{
		 return driver.findElement(lName);
	}
	
	public WebElement enterWorkEmail()
	{
		return driver.findElement(workEmail);
	}
	
	public WebElement enterJobTitle() 
	{
		return driver.findElement(jobTitle);
	}
	
	public WebElement enterCompany()
	{
		return driver.findElement(company);
	}
	
	public WebElement selectEmployee()
	{
		return driver.findElement(employee);		
	}
	
	public WebElement enterPhone()
	{
		return driver.findElement(phone);		
	}
	
	public WebElement selectLang()
	{
		return driver.findElement(lang);
	}
	
	public WebElement ClickOnSignUPbutton()
	{
		return driver.findElement(SignUpbutton);		
	}
	
	public WebElement ClickOnChecBox()
	{
		return driver.findElement(Iagree);
	}
	
}
