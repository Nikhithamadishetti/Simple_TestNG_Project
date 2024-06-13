import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(ITestListernerTests.class)
public class ListernerTest {
	
	
	@Test
	public void test1()
	{
		System.out.println("testpassed");
		Assert.assertEquals(1,1);
	}
	
	@Test
	public void test2()
	{
		System.out.println("test fail");
		Assert.assertEquals(1,2);
	}
	
	@Test
	public void test3()
	{
		System.out.println("test skip");
		throw new SkipException("This is skipped");
	}

}
