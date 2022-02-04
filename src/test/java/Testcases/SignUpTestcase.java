package Testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pom.SignUpPage;
import resources.BaseClass;

public class SignUpTestcase extends BaseClass {

	@Test
	public void SignUp() throws IOException {
		try {
			driver = initialization();
			//driver.get("https://login.salesforce.com/?locale=eu");

			SignUpPage signUP = new SignUpPage(driver);

			signUP.clickOnFreetry().click();
			signUP.enterFname().sendKeys("Nikhil");
			signUP.enterFname().sendKeys("Ludhekar");
			signUP.enterJobTitle().sendKeys("QA");
			signUP.enterWorkEmail().sendKeys("nikhil@Sagitec.com");
			signUP.enterPhone().sendKeys("4567867567");
			signUP.enterCompany().sendKeys("Sagitec solution");
			Select emp = new Select(signUP.selectEmployee());
			emp.selectByValue("350");
			Select lang = new Select(signUP.selectLang());
			lang.selectByValue("en_US");
			signUP.ClickOnChecBox().click();
			signUP.ClickOnSignUPbutton().click();
			String abc="test";
			String cdr="Test2";
			assertEquals(abc, cdr);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	
	}
}
