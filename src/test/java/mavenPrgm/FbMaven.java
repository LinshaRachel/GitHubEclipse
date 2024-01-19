package mavenPrgm;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FbMaven {
	@Test
	public void test()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

}
