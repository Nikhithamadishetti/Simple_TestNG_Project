import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TC1 {

	@BeforeMethod
	public void setup() {
		System.out.println("opening browser");
	}
	
	@AfterMethod
	public void teardown() {
		System.out.println("close browser");
	}

	@Test
	public void TC1() {
		System.out.println("TC1");
	}
	
	@BeforeSuite
	public void beforesuit() {
		System.out.println("beforesuit");
	}
	

	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before class...");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("After class...");
	}
	
	@AfterSuite
	public void Aftersuit() {
		System.out.println("Aftersuit");
	}

	@Test
	public void TC2() {
		System.out.println("TC2");
	}
}
