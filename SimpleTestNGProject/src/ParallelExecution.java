import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ParallelExecution {

	WebDriver driver;
	@Test
	public void logo() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		WebElement logo=driver.findElement(By.className("orangehrm-login-logo"));
		Assert.assertTrue(logo.isDisplayed());
		Thread.sleep(5000);
	}

	@Test
	public void title() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"OrangeHRM");
		Thread.sleep(5000);
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
}
