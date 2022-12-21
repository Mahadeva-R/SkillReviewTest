package testRunnerClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.DataProviderForWikiPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageClasses.MainPage;

public class TestWikiPediaSearch {

	MainPage mainPage;
	WebDriver driver;
	private static final String URL = "https://en.wikipedia.org/wiki/Main_Page";
	
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
	}
	
	
	@Test (dataProvider = "CountryData" , dataProviderClass = DataProviderForWikiPage.class)
	public void testCountrySearc(String country, String capital) {
		mainPage = new MainPage(driver);
		String actualCapital = mainPage.searchForValue(country).getCountryCapital();
		
		Assert.assertEquals(actualCapital, capital);
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
		driver = null;
	}
}
