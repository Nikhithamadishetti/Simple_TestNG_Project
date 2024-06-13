import org.testng.annotations.Test;

public class SecTestNGTestCase {
	@Test(priority = 1)
	public void setup() {
		System.out.println("opening browser");
	}

	@Test(priority = 3)
	public void SearchCustomer() {
		System.out.println("SearchCustomer");
	}

	@Test(priority = 2)
	public void AddCustomer() {
		System.out.println("AddCustomer");
	}

	
	@Test(priority = 4)
	public void teardown() {
		System.out.println("closing browser");
	}
}
