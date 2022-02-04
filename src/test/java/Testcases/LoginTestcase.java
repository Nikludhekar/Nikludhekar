package Testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pom.LoginPage;
import resources.BaseClass;

public class LoginTestcase extends BaseClass{
    
	
	@Test(dataProvider="dataProvidermethod")
	public void LaunchURL(String username,String password ) throws IOException  
	{
		driver=initialization();
		//driver.get("https://login.salesforce.com/?locale=eu");
		
		LoginPage login=new LoginPage(driver);
		login.enterUsername().sendKeys(username);
		login.enterpassword().sendKeys(password);
		login.clickOnLogin().click();
		
	WebElement text=	driver.findElement(By.xpath("//div[@id='error']"));
		
	String	actual=text.getText();	
		String expected="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		assertEquals(actual, expected);
	}
	
	@DataProvider
	public Object[][] dataProvidermethod()
	{
		Object[][] obj=new Object[2][2];
		obj[0][0]="Test1";
		obj[0][1]="1234";
		obj[1][0]="Test2";
		obj[1][1]="123";
		return obj;
	}
}
