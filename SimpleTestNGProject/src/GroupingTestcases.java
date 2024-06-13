import org.testng.annotations.Test;

public class GroupingTestcases {
	
	@Test(groups="sanity")
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test(groups="regression")
	public void test2()
	{
		System.out.println("test2");
	}
	
	@Test(groups="sanity")
	public void test3() {
		System.out.println("test3");
	}
	
	@Test(groups="sanity")
	public void test4() {
		System.out.println("test4");
	}

	@Test(groups="regression")
	public void test5() {
		System.out.println("test5");
	}

	@Test(groups="regression")
	public void test6() {
		System.out.println("test6");
	}
	
	@Test(groups="regression")
	public void test7() {
		System.out.println("test7");
	}
	
	@Test(groups={"regression","sanity"})
	public void test8() {
		System.out.println("test8");
	}
	
	

}
