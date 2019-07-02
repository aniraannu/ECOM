package generic;
//Imported lib:
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericUtils {
	//Generic methods that can be used throughout testscripts
	//Methods to handle ListBox
	//1.Using Index
	public static void gSelectByIndex(WebElement element, int n) {
	Select select= new Select(element);
	select.selectByIndex(n);
	}
	public static void deSelectByIndex(WebElement element, int n) {
	Select select= new Select(element);	
	select.deselectByIndex(n);
	}
	//2.Using Value
	public static void gSelectByValue(WebElement element, String v) {
	Select select= new Select(element);
	select.selectByValue(v);
	}
    public static void deSelectByValue(WebElement element, String v) {
    Select select= new Select(element);
    select.deselectByValue(v);
	}
    //3.Using Visible Text
    public static void gSelectByVisibleText(WebElement element, String vTxt) {
    Select select= new Select(element);
    select.selectByVisibleText(vTxt);
	}
    public static void deSelectByVisibleText(WebElement element, String vTxt) {
    Select select= new Select(element);
    select.deselectByVisibleText(vTxt);
	}
    //Mouse Hovering 
    public static void hover(WebDriver driver, WebElement toElement) {
    Actions action = new Actions(driver);
    action.moveToElement(toElement).build().perform();
    }
    //Context ClickClick
    public static void contextClick(WebDriver driver, WebElement element) {
    Actions action = new Actions(driver);
    action.contextClick(element).perform();
    }
    //Double Click
    public static void doubleClick(WebDriver driver, WebElement element) {
    Actions action = new Actions(driver);
    action.doubleClick().perform();
    }
    //Drag and Drop
    public static void dragAndDrop(WebDriver driver, WebElement srcElement, WebElement trgtElement) {
    Actions action = new Actions(driver);
    action.dragAndDrop(srcElement, trgtElement).perform();
    }
    //Move to an element
    public static void moveToElement(WebDriver driver, WebElement toElement) {
    Actions action = new Actions(driver);
    action.moveToElement(toElement).perform();
    }
    //Wait methods
    //1.Wait until page is loaded(Page Load timeout)
    public static void waitUntilPageLoad(WebDriver driver) {
    	driver.manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);
    }
    //2.Implicitly Wait
    public static void implicitWait(WebDriver driver) {
    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    }
    //3.WebDriverWait : until the visibility of WebElement 
    public static void waitUntilVisibleElement(WebDriver driver,WebElement element) {
    	WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));	
    }
}
