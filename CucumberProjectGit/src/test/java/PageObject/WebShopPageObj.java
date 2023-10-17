package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebShopPageObj {

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmPass() {
		return confirmPass;
	}

	public WebElement getRegisterBtn() {
		return registerBtn;
	}
	
	public WebElement getVerificationMsg() {
		return verificationMsg;
	}
	
	WebDriver driver;

	public WebShopPageObj(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class=\"ico-register\"]")
	private WebElement registerLink;
	
	@FindBy(xpath = "//input[@id=\"gender-female\"]")
	private WebElement gender;
	
	@FindBy(xpath = "//input[@id=\"FirstName\"]")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@id=\"LastName\"]")
	private WebElement lastName;
	
	@FindBy(xpath = "//input[@id=\"Email\"]")   
	private WebElement email;
	
	@FindBy(xpath = "//input[@id=\"Password\"]")
	private WebElement password;
	
	@FindBy(xpath = "//input[@id=\"ConfirmPassword\"]")
	private WebElement confirmPass;
	
	@FindBy(xpath = "//input[@id=\"register-button\"]")
	private WebElement registerBtn;
	
	@FindBy(xpath = "//div[@class=\"result\"]")
	private WebElement verificationMsg;


}
