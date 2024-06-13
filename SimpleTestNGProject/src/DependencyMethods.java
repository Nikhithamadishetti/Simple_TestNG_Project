import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods {

	@Test
	public void readycar()
	{
		Assert.assertFalse(true);
		System.out.println("readycar");
	}
	
	@Test(dependsOnMethods="readycar")
	public void startcar()
	{
		System.out.println("startcar");
	}
	
	@Test(dependsOnMethods="startcar")
	public void stopcar()
	{
		System.out.println("stopcar");
	}
	
	@Test(dependsOnMethods="stopcar",alwaysRun=true)
	public void parkcar()
	{
		System.out.println("parkcar");
	}
}
