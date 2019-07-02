package generic;
//Imported lib:
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class BaseTest implements AutoConst{
	//The base test or precondition and postconditions that need to be executed for every test
	public static WebDriver driver;
	//PreCondition:
	@BeforeMethod
	public void preCondition(){
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//url to Craftsvilla.com
		driver.get("https://www.craftsvilla.com/");
	}
	//PostCondition:
	@AfterMethod
	public void postCondition() {
		driver.close();	
	}
}
