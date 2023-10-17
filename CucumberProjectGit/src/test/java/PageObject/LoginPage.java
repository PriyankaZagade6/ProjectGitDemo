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
	
	


}
