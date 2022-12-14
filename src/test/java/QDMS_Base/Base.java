package QDMS_Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class Base {
	public static WebDriver driver;

	@BeforeSuite
	public void main() {
		System.setProperty("webdriver.chrome.driver","C:\\Browser Drivers\\chromedriver.exe");
	     driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qdms-phase-3.s3-website.ap-south-1.amazonaws.com/#/login");

	}

}
