package pageClasses;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

	WebDriver driver;
	
	private static final String SEARCH_TEXTFIELD_BY_NAME = "search";
	private static final String CLICK_ON_SEARCH_ICON_BY_ID = "searchButton";
			
	public MainPage(WebDriver driver){
		this.driver=driver;
	}
	
	public SearchPage searchForValue(String value) {
		driver.findElement(By.name(SEARCH_TEXTFIELD_BY_NAME)).sendKeys(value);
		driver.findElement(By.id(CLICK_ON_SEARCH_ICON_BY_ID)).click();
		return new SearchPage(driver);
	}
}
