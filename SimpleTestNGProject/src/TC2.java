import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC2 {

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
	
	@BeforeMethod
	public void setup() {
		System.out.println("opening browser");
	}
	
	@AfterMethod
	public void teardown() {
		System.out.println("close browser");
	}

	@Test
	public void TC3() {
		System.out.println("TC3");
	}

	@Test
	public void TC4() {
		System.out.println("TC4");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("beforetest");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("AfterTest");
	}
	
	
}
