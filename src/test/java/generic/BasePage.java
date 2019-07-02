package generic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage {
	//Webdriver object declared as global variable
	public static WebDriver driver;
	//Initiation using Constructor
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	//Basic Page Methods:
	//Page level verification
	public static void verifyTitle(String eTitle) {
		try{
			WebDriverWait wait = new WebDriverWait(driver,20);
		    wait.until(ExpectedConditions.titleIs(eTitle));
		    Reporter.log("Title is matching ", true);
		}
		catch(Exception ex){
			Reporter.log("Title is not matching",true);
		}
	}
	//Element level verification
	public static void verifyElementPresent(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Element is present",true);
		}
		catch(Exception ex) {
			Reporter.log("Element is not present",true);
		}
		
	}
}
