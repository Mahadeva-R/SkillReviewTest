package pageClasses;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

	WebDriver driver;
	
	private static final String CAPITAL_BY_XPATH = "//th[text()='Capital']/../td/a";

	
	SearchPage(WebDriver driver){
		this.driver = driver;
	}

	public String getCountryCapital() {
	return driver.findElement(By.xpath(CAPITAL_BY_XPATH)).getAttribute("title");	
	}
	
}
