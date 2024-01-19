package mavenPrgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Blazedemopage {
	WebDriver driver;
	By name=By.id("name");
	By company=By.id("company");
	By email=By.id("email");
	By password=By.id("password");
	By passwordconfirm=By.name("password_confirmation");
	By register=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");
	By login=By.id("email");
	By passwrd=By.id("password");
	By loginbutton=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button");
	
	
	
	public Blazedemopage (WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalues(String names,String companyname,String emailid,String psw,String pswconfirm)
	{
	driver.findElement(name).sendKeys(names);
	driver.findElement(company).sendKeys(companyname);
	driver.findElement(email).sendKeys(emailid);
	driver.findElement(password).sendKeys(psw);
	driver.findElement(passwordconfirm).sendKeys(pswconfirm);
	}
	public void setvalue(String emails,String passwords)
	{
		driver.findElement(login).sendKeys(emails);
		driver.findElement(passwrd).sendKeys(passwords);
	}
	public void register()
	{
		driver.findElement(register).click();
	}
	public void login()
	{
		driver.findElement(login).click();
		driver.findElement(loginbutton).click();
				
	}

}
