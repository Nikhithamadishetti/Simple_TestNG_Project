import org.testng.annotations.Test;

public class TestMethodUsingDataProviderMethod {
	@Test(dataProvider="LoginDataProvider",dataProviderClass=Dataprovider.class)
	public void useData(String mail,String pwd)
	{
		System.out.println(mail+ "     " +pwd);
	}
	
}
