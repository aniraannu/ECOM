package scripts;
//Imported lib:
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import generic.BaseTest;
import generic.GenericUtils;
import pom.HomePage;
//All the regression tests:
//Inherits the pre and post condition methods from BaseTest class
public class TestScripts extends BaseTest{
	//Test1.Sorting product based on popularity
	@Test(enabled=true)
	public void testSortProductPopularity() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.clickSignIn();
		Thread.sleep(2000);
		hp.setUserId("aniraannu@gmail.com");
		hp.clickCntnBtn();
		Thread.sleep(2000);
		hp.setPwd("3hjhzv");
		hp.clickLoginBtn();
		Thread.sleep(2000);
		WebElement toElement = driver.findElement(By.partialLinkText("MEN'S WEAR"));
		GenericUtils.hover(driver, toElement);
		Thread.sleep(2000);
		hp.clickKurtas();
		hp.sortByPopularity();
		Thread.sleep(2000);
		hp.selectPdt(5);
		Thread.sleep(2000);
		hp.selectSize(1);
		hp.setPincode("685508");
		hp.checkPincode();
		hp.clickAddToCart();
		Thread.sleep(3000);
		hp.clickMyAccount();
		Thread.sleep(2000);
		hp.clickLogout();
	}
	//Test2.Sort product based on Price- Low to High
	@Test(enabled=false)
	public void testSortProductPriceLtoH() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.clickSignIn();
		GenericUtils.waitUntilPageLoad(driver);
		hp.setUserId("aniraannu@gmail.com");
		hp.clickCntnBtn();
		GenericUtils.waitUntilVisibleElement(driver, driver.findElement(By.id("js-password")));
		hp.setPwd("3hjhzv");
		hp.clickLoginBtn();
		Thread.sleep(2000);
		WebElement toElement = driver.findElement(By.partialLinkText("MEN'S WEAR"));
		GenericUtils.hover(driver, toElement);
		GenericUtils.implicitWait(driver);
		hp.clickKurtas();
		hp.sortByPriceLtoH();
		GenericUtils.waitUntilPageLoad(driver);
		hp.selectPdt(6);
		GenericUtils.waitUntilPageLoad(driver);
		hp.selectSize(1);
		Thread.sleep(3000);
		hp.setPincode("685508");
		hp.checkPincode();
		hp.clickAddToCart();
		GenericUtils.waitUntilPageLoad(driver);
		hp.clickMyAccount();
		hp.clickLogout();	
	}
	//Test3:Sort product based on price: High to Low
	@Test(enabled=true)
	public void testSortProductPriceHtoL() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.clickSignIn();
		GenericUtils.waitUntilPageLoad(driver);
		hp.setUserId("aniraannu@gmail.com");
		hp.clickCntnBtn();
		GenericUtils.waitUntilVisibleElement(driver, driver.findElement(By.id("js-password")));
		hp.setPwd("3hjhzv");
		hp.clickLoginBtn();
		Thread.sleep(2000);
		WebElement toElement = driver.findElement(By.partialLinkText("MEN'S WEAR"));
		GenericUtils.hover(driver, toElement);
		GenericUtils.implicitWait(driver);
		hp.clickKurtas();
		hp.sortByPriceHtoL();
		GenericUtils.waitUntilPageLoad(driver);
		hp.selectPdt(6);
		GenericUtils.waitUntilPageLoad(driver);
		hp.selectSize(1);
		Thread.sleep(3000);
		hp.setPincode("685508");
		hp.checkPincode();
		hp.clickAddToCart();
		GenericUtils.waitUntilPageLoad(driver);
		hp.clickMyAccount();
		hp.clickLogout();		
	}
	//Test4:Sort product based on discount
	@Test(enabled=true)
	public static void testSortProductDiscount() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.clickSignIn();
		GenericUtils.waitUntilPageLoad(driver);
		hp.setUserId("aniraannu@gmail.com");
		hp.clickCntnBtn();
		GenericUtils.waitUntilVisibleElement(driver, driver.findElement(By.id("js-password")));
		hp.setPwd("3hjhzv");
		hp.clickLoginBtn();
		Thread.sleep(2000);
		WebElement toElement = driver.findElement(By.partialLinkText("MEN'S WEAR"));
		GenericUtils.hover(driver, toElement);
		GenericUtils.implicitWait(driver);
		hp.clickKurtas();
		hp.sortByDiscount();
		GenericUtils.waitUntilPageLoad(driver);
		hp.selectPdt(6);
		GenericUtils.waitUntilPageLoad(driver);
		hp.selectSize(1);
		Thread.sleep(3000);
		hp.setPincode("685508");
		hp.checkPincode();
		hp.clickAddToCart();
		GenericUtils.waitUntilPageLoad(driver);
		hp.clickMyAccount();
		hp.clickLogout();	
	}
	//Test5:Sort by popularity; increase product quantity in cart
	@Test(enabled=true)
	public static void testSortByPopularity_IncPdtQntyCart() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.clickSignIn();
		GenericUtils.waitUntilPageLoad(driver);
		hp.setUserId("aniraannu@gmail.com");
		hp.clickCntnBtn();
		GenericUtils.waitUntilVisibleElement(driver, driver.findElement(By.id("js-password")));
		hp.setPwd("3hjhzv");
		hp.clickLoginBtn();
		Thread.sleep(2000);
		WebElement toElement = driver.findElement(By.partialLinkText("MEN'S WEAR"));
		GenericUtils.hover(driver, toElement);
		GenericUtils.implicitWait(driver);
		hp.clickKurtas();
		hp.sortByPopularity();
		GenericUtils.waitUntilPageLoad(driver);
		hp.selectPdt(6);
		GenericUtils.waitUntilPageLoad(driver);
		hp.selectSize(1);
		Thread.sleep(3000);
		hp.setPincode("685508");
		hp.checkPincode();
		hp.clickAddToCart();
		GenericUtils.waitUntilPageLoad(driver);
		hp.incPdtQty(1);
		hp.clickMyAccount();
		hp.clickLogout();	
	}
	//Test6:Sort by Price(Low to High) ;increase product quantity in cart
	@Test(enabled=true)
	public static void testSortByPriceLtoH_IncPdtQty() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.clickSignIn();
		GenericUtils.waitUntilPageLoad(driver);
		hp.setUserId("aniraannu@gmail.com");
		hp.clickCntnBtn();
		GenericUtils.waitUntilVisibleElement(driver, driver.findElement(By.id("js-password")));
		hp.setPwd("3hjhzv");
		hp.clickLoginBtn();
		Thread.sleep(2000);
		WebElement toElement = driver.findElement(By.partialLinkText("MEN'S WEAR"));
		GenericUtils.hover(driver, toElement);
		GenericUtils.implicitWait(driver);
		hp.clickKurtas();
		hp.sortByPriceLtoH();
		GenericUtils.waitUntilPageLoad(driver);
		hp.selectPdt(6);
		GenericUtils.waitUntilPageLoad(driver);
		hp.selectSize(1);
		Thread.sleep(3000);
		hp.setPincode("685508");
		hp.checkPincode();
		hp.clickAddToCart();
		GenericUtils.waitUntilPageLoad(driver);
		hp.incPdtQty(1);
		hp.clickMyAccount();
		hp.clickLogout();		
	}
	//Test 7:Sort by price(High to Low);Increase product quantity in cart
	@Test(enabled=true)
	public static void testSortByPriceHtoL_IncPdtQty() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.clickSignIn();
		GenericUtils.waitUntilPageLoad(driver);
		hp.setUserId("aniraannu@gmail.com");
		hp.clickCntnBtn();
		GenericUtils.waitUntilVisibleElement(driver, driver.findElement(By.id("js-password")));
		hp.setPwd("3hjhzv");
		hp.clickLoginBtn();
		Thread.sleep(2000);
		WebElement toElement = driver.findElement(By.partialLinkText("MEN'S WEAR"));
		GenericUtils.hover(driver, toElement);
		GenericUtils.implicitWait(driver);
		hp.clickKurtas();
		hp.sortByPriceHtoL();
		GenericUtils.waitUntilPageLoad(driver);
		hp.selectPdt(6);
		GenericUtils.waitUntilPageLoad(driver);
		hp.selectSize(1);
		Thread.sleep(3000);
		hp.setPincode("685508");
		hp.checkPincode();
		hp.clickAddToCart();
		GenericUtils.waitUntilPageLoad(driver);
		hp.incPdtQty(1);
		hp.clickMyAccount();
		hp.clickLogout();	
	}
	//Test8:Sort by discount; Increase product quantity
	@Test(enabled=true)
	public static void testSortByDiscount_IncPdtQty() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.clickSignIn();
		GenericUtils.waitUntilPageLoad(driver);
		hp.setUserId("aniraannu@gmail.com");
		hp.clickCntnBtn();
		GenericUtils.waitUntilVisibleElement(driver, driver.findElement(By.id("js-password")));
		hp.setPwd("3hjhzv");
		hp.clickLoginBtn();
		Thread.sleep(2000);
		WebElement toElement = driver.findElement(By.partialLinkText("MEN'S WEAR"));
		GenericUtils.hover(driver, toElement);
		GenericUtils.implicitWait(driver);
		hp.clickKurtas();
		hp.sortByDiscount();
		GenericUtils.waitUntilPageLoad(driver);
		hp.selectPdt(6);
		GenericUtils.waitUntilPageLoad(driver);
		hp.selectSize(1);
		Thread.sleep(3000);
		hp.setPincode("685508");
		hp.checkPincode();
		hp.clickAddToCart();
		GenericUtils.waitUntilPageLoad(driver);
		hp.incPdtQty(1);
		hp.clickMyAccount();
		hp.clickLogout();	
	}
	//Test9: Sort by popularity; Add multiple products, increase quantity
	@Test(enabled=true)
	public static void testSortByPopularity_IncPdtQty_MulPdts() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.clickSignIn();
		GenericUtils.waitUntilPageLoad(driver);
		hp.setUserId("aniraannu@gmail.com");
		hp.clickCntnBtn();
		GenericUtils.waitUntilVisibleElement(driver, driver.findElement(By.id("js-password")));
		hp.setPwd("3hjhzv");
		hp.clickLoginBtn();
		Thread.sleep(2000);
		WebElement toElement = driver.findElement(By.partialLinkText("MEN'S WEAR"));
		GenericUtils.hover(driver, toElement);
		GenericUtils.implicitWait(driver);
		hp.clickKurtas();
		hp.sortByPopularity();
		GenericUtils.waitUntilPageLoad(driver);
		hp.selectPdt(6);
		GenericUtils.waitUntilPageLoad(driver);
		hp.selectSize(1);
		Thread.sleep(3000);
		hp.setPincode("685508");
		hp.checkPincode();
		hp.clickAddToCart();
		driver.navigate().back();
		driver.navigate().back();
		hp.selectPdt(4);
		GenericUtils.waitUntilPageLoad(driver);
		hp.selectSize(1);
		hp.clickAddToCart();
		GenericUtils.waitUntilPageLoad(driver);
		hp.incPdtQty(1);
		hp.incPdtQty(2);
		hp.clickMyAccount();
		hp.clickLogout();
	}
	//Test10: Sort by price(Low to high); Add multiple products, increase quantity
	@Test(enabled=true)
	public static void testSortByPriceLtoH_IncPdtQty_MulPdts() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.clickSignIn();
		GenericUtils.waitUntilPageLoad(driver);
		hp.setUserId("aniraannu@gmail.com");
		hp.clickCntnBtn();
		GenericUtils.waitUntilVisibleElement(driver, driver.findElement(By.id("js-password")));
		hp.setPwd("3hjhzv");
		hp.clickLoginBtn();
		Thread.sleep(2000);
		WebElement toElement = driver.findElement(By.partialLinkText("MEN'S WEAR"));
		GenericUtils.hover(driver, toElement);
		GenericUtils.implicitWait(driver);
		hp.clickKurtas();
		hp.sortByPriceLtoH();
		GenericUtils.waitUntilPageLoad(driver);
		hp.selectPdt(5);
		GenericUtils.waitUntilPageLoad(driver);
		hp.selectSize(1);
		Thread.sleep(3000);
		hp.setPincode("685508");
		hp.checkPincode();
		hp.clickAddToCart();
		driver.navigate().back();
		driver.navigate().back();
		hp.selectPdt(7);
		GenericUtils.waitUntilPageLoad(driver);
		hp.selectSize(1);
		hp.clickAddToCart();
		GenericUtils.waitUntilPageLoad(driver);
		hp.incPdtQty(1);
		hp.incPdtQty(2);
		hp.clickMyAccount();
		hp.clickLogout();
	}
}
