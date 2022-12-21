package Utility;
import org.testng.annotations.DataProvider;

public class DataProviderForWikiPage {

	
	@DataProvider(name = "CountryData")
	public Object[][] getCountryName(){
		return new Object[][] {
			{"India","New Delhi"},
			{"England", "London"}
		};
	}
}
