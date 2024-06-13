import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class FirstTestNGTestCase {

	@Test(priority = 2)
	public void setup() {
		System.out.println("opening browser");
	}

	@Test(priority = 1)
	public void loginTest() {
		System.out.println("login");
	}

	@Test(priority = 3,enabled=false)
	public void teardown() {
		System.out.println("closing browser");
	}

}
