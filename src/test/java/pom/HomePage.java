package pom;
import org.openqa.selenium.By;
//First WebPage : WebElements and methods
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.BasePage;
//HomePage inherits the methods from the BasePage
public class HomePage extends BasePage{
	//Constructor to initialize driver object
	public HomePage(WebDriver driver) {
		super(driver);
	    PageFactory.initElements(driver, this);
	}
	//WebElements in the page:
	//1.Sign In
	@FindBy(xpath="//span[.='Sign In']")
	private WebElement signInBtn;
	@FindBy(xpath="//input[@id='emailId']")
	private WebElement userIdTxtBx;
	@FindBy(xpath="//div[@id='continueBtn']")
	private WebElement continueBtn;
	@FindBy(id="js-password")
	private WebElement pwdTxtBx;
	@FindBy(xpath="//div[@id='loginCheck']")
	private WebElement logInBtn;
	@FindBy(id="forgotPasswordLink")
	private WebElement frgtPwdLnk;
	@FindBy(xpath="//input[@id='user-emailId']")
	private WebElement userIdTxtBx1;
	@FindBy(id="send-password")
	private WebElement sendPwdBtn;
	//2.Cart
	@FindBy(xpath="//a[@id='cartCount']")
	private WebElement cartBtn;
	@FindBy(xpath="//button[@id='addtocart']")
	private WebElement addToCartBtn;
	@FindBy(id="buynow")
	private WebElement buyNowBtn;
	@FindBy(id="pincode_value")
	private WebElement pincodeTxtBx;
	@FindBy(id="submitpincode")
	private WebElement checkPincodeBtn;
	//3.My Account
	@FindBy(xpath="//a[@class='dropdown dropdown-toggle']")
	private WebElement myAccountDrpDownMenu;
	@FindBy(xpath="My Orders")
	private WebElement myOrdersOptn;
	@FindBy(xpath="//a[.='Wishlist']")
	private WebElement wishlistOptn;
	@FindBy(xpath="//a[.='My Address']")
	private WebElement myAddressOptn;
	@FindBy(xpath="//a[.='Bank Details']")
	private WebElement bankDetailsOptn;
	@FindBy(xpath="//a[@class='js-logout']")
	private WebElement logoutOptn;
	//4.DropDown Lists and Menu Options
	//SAREES
	@FindBy(xpath="//a[.='SAREES']")
	private WebElement sareeDrpDwnMenu;
	//KURTIS & DRESSES
	@FindBy(xpath="//a[.='KURTIS & DRESSES ']")
	private WebElement kurtisDressesDrpDwnMenu;
	//SALWAR SUITS
	@FindBy(xpath="//a[.='SALWAR SUITS ']")
	private WebElement salwarDrpDwnMenu;
	//JEWELRY
	@FindBy(xpath="//a[.='JEWELRY ']")
	private WebElement jewelryDrpDwnMenu;
	//LEHENGAS & GOWNS
	@FindBy(xpath="//a[.='LEHENGAS & GOWNS ']")
	private WebElement lehangasGownsDrpDwnMenu;
	//MENS WEAR
	@FindBy(xpath="//a[@href='https://www.craftsvilla.com/cvfeeds/buy-all-styles-men-ethnic-wear-online-craftsvilla']")
	private WebElement mensWearDrpDwnMenu;
	@FindBy(xpath="//a[.=' Kurtas']")
	private WebElement kurtas;
	//5.Sorting options
	@FindBy(id="sortByNone")
	private WebElement srtByPty;
	@FindBy(id="discountedPriceOrder_ASC")
	private WebElement srtByPrcLth;
	@FindBy(id="discountedPriceOrder_DESC")
	private WebElement srtByPrcHtl;
	@FindBy(id="discountPercentageOrder_DESC")
	private WebElement srtByDsnt;
	
	//Page Methods
	//1.Login Methods
	public void clickSignIn() {
		signInBtn.click();
	}
	public void setUserId(String uId) {
		userIdTxtBx.sendKeys(uId);
	}
	public void clickCntnBtn() {
		continueBtn.click();
	}
	public void setPwd(String pwd) {
		pwdTxtBx.sendKeys(pwd);
	}
	public void clickLoginBtn() {
		logInBtn.click();
	}
	//2.Account settings
	public void clickMyAccount() {
		myAccountDrpDownMenu.click();
	}
	public void clickLogout() {
		logoutOptn.click();
	}
	//3.Select menu options
	public void clickKurtas() {
		kurtas.click();
	}
	//4.Sort the products using different options
	public void sortByPopularity() {
		srtByPty.click();
	}
	public void sortByPriceLtoH() {
		srtByPrcLth.click();
	}
	public void sortByPriceHtoL() {
		srtByPrcHtl.click();
	}
	public void sortByDiscount() {
		srtByDsnt.click();
	}
	//5.Product
	public void selectPdt(int a) {
		WebElement pdt = driver.findElement(By.xpath("//div[@data-position='"+a+"']/.."));
		pdt.click();
	}
	public void selectSize(int s) {
		WebElement size = driver.findElement(By.xpath("//a[@class='pdp-size-variant']/../a["+s+"]"));
		size.click();
	}
	//6.Cart
	public void clickAddToCart() {
		addToCartBtn.click();
	}
	public void clickBuyNow() {
		buyNowBtn.click();
	}
	public void setPincode(String pin) {
		pincodeTxtBx.sendKeys(pin);
	}
	public void checkPincode() {
		checkPincodeBtn.click();
	}
	public void incPdtQty(int productNo) {
		WebElement qty = driver.findElement(By.xpath("//div[@id='cart-page-order-items']/div["+productNo+"]/div[2]/div[1]/span[3]"));
		qty.click();
	}
}
