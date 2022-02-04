package pom;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage   {

	public WebDriver driver;
	
	By username=By.xpath("//input[@type='email']");
    By password=By.xpath("(//form[@name='login']//input)[22]");
    By Login=By.xpath("//input[@type='submit']");
    
			
	public LoginPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}

	public WebElement enterUsername()
	{
		return driver.findElement(username);
	}
	
	public WebElement enterpassword()
	{
		return driver.findElement(password);
	
	}
	
	public WebElement clickOnLogin()
	{
		return driver.findElement(Login);
	}
	
}
