import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AssertionsAndParameter {
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser","url"})
	public void setup(String browser,String url) throws InterruptedException
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		Thread.sleep(5000);
		}
		
		if(browser.equalsIgnoreCase("firefox"))
		{
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		Thread.sleep(5000);
		}
	}
	
	@Test(priority=1)
	public void logo() throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement logo=driver.findElement(By.className("orangehrm-login-logo"));
		Assert.assertTrue(logo.isDisplayed());
	}
	
	@Test(priority=2)
	public void title() throws InterruptedException
	{
		Thread.sleep(5000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"OrangeHRM");
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}

}
