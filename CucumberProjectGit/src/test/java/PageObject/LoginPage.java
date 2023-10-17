package PageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinition1.BaseTest;

public class LoginPage extends BaseTest {
	
	
	

	public void clickOnLoginLink() {

       LoginLink.click();

	}

   public void enterEmail(String Email) {

    emailLogin.sendKeys(Email);

   }

   public void enterPass(String Password) 
   {

     passwordLogin.sendKeys(Password);
   }

   public void clickOnLoginButton() 
   {

     submitBtn.click();
    }
   
	public void getLoginPageTitle() 
	{
       String expected_HomeTitle ="Demo Web Shop";
		
		String HomeActualtitle=driver.getTitle();
		Assert.assertEquals(HomeActualtitle,expected_HomeTitle);
	}
	
	public void clickOnElectronics() {

		 electronics.click();

       }

   public void clickOnCellPhones() {

     cellPhone.click();
     }

   public void clickOnAddToCart() {

      addToCartBtn.click();
   }

 
    public void validateMsg() {

      successMsg.isDisplayed();
    }


    public void ClickOnShoppingcart() {

    	ShoppingCartLink.click();
    }

	
    public void VerifyShoppingcartProduct() {

    	
       String expected_ProductTitle ="Smartphone";
		
	
		//Assert.assertEquals(HomeActualtitle,expected_HomeTitle);
    	String Product=ShoppingCartVerify.getText();
    	Assert.assertEquals(Product,expected_ProductTitle);
    }

	
	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='ico-login']")
	private WebElement LoginLink;
	
	
	
	@FindBy(xpath = "//input[@id='Email']")   
	private WebElement emailLogin;
	
	@FindBy(xpath = "//input[@id='Password']")
	private WebElement passwordLogin;
	
	@FindBy(xpath = "(//input[@type=\"submit\"])[2]")
    private WebElement submitBtn;
	
	
	@FindBy(xpath = "(//a[@href=\"/electronics\"])[1]")
    private WebElement electronics;

   @FindBy(xpath = "//img[@alt=\"Picture for category Cell phones\"]")
   private WebElement cellPhone;

   @FindBy(xpath = "(//input[@value=\"Add to cart\"])[1]")
   private WebElement addToCartBtn;

    @FindBy(xpath = "//p[text()='The product has been added to your ']")
    private WebElement successMsg;
	
	@FindBy(xpath = "(//*[@id='topcartlink']/a/span[1]")
	private WebElement ShoppingCartLink;
	
	@FindBy(xpath = "(//*[@class='product-name']")
	private WebElement ShoppingCartVerify;
	
	


}
