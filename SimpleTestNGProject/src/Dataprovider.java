import org.testng.annotations.DataProvider;

public class Dataprovider{
	
	@DataProvider(name="LoginDataProvider")
	public Object[][] getData()
	{
	      Object[][] data={{"abc@gmail.com","pwd1"},{"def@gmail.com","pwd1"},{"ghi@gmail.com","pwd1"}};
	      return data;
	}

}
