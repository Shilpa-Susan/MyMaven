package TestDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OrangeHRM {
	
	WebDriver driver;
	@BeforeClass
	public void StartBrowser()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	public void OpenApp() throws InterruptedException
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String Title=driver.getTitle();
		Assert.assertTrue(Title.contains("Orange"),"Title doesnot match");
		driver.quit();
	}

}
