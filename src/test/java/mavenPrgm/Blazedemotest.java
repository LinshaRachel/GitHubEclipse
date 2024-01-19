package mavenPrgm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Blazedemotest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://blazedemo.com/register");
	}
	@Test
	public void testlogin()
	{
		Blazedemopage ob=new Blazedemopage(driver);
		ob.setvalues("Anu","demo" , "rachellinsha@gmail.com", "anu@123", "anu@123");
		ob.register();
		ob.login();
		ob.setvalue("anu@gmail.com", "anu@123");
		ob.login();
	}
}
		


