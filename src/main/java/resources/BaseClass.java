package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public WebDriver driver; // public WebDriver accessible for whole project
	
	public WebDriver initialization() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\nikhil.ludhekar\\eclipse-workspace\\POMFrameWork\\src\\main\\java\\resources\\Data.properties");
		prop.load(fis);
		String Browsername = prop.getProperty("Browser");
	String URL=prop.getProperty("url");
	driver.get(URL);
		if (Browsername.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (Browsername.equals("Firefox")) {
			// firefox code
		} else if (Browsername.equals("IE")) {
			// Internet explore
		}
		return driver;
	}
}
