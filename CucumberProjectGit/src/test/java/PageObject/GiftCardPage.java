package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCardPage {
	
	WebDriver driver;

	public void ClickOnGiftCardLink() {

		giftCardLink.click();

	}

	public void clickOnForthCard() {

		forthCard.click();
		;

	}

	public void enterName(String recName) {

		rName.sendKeys(recName);

	}

	public void enterMessage(String msg) {

		message.sendKeys(msg);

	}

	public void clickFrndEmailBtn() {

		fEmailBtn.click();
		;

	}

	public void enterEmailFrnd(String email2) {

		emailFrnd.sendKeys(email2);

	}

	public void clickOnSendBtn() {

		sendEmailBtn.click();

	}

	public void Vmsg() {

		successMsg.isDisplayed();

	}

	public GiftCardPage(WebDriver driver) {

 

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//a[@href=\"/gift-cards\"])[1]")

	private WebElement giftCardLink;

	@FindBy(xpath = "(//a[@href=\"/100-physical-gift-card\"])[2]")

	private WebElement forthCard;

	@FindBy(xpath = "//input[@class=\"recipient-name\"]")

	private WebElement rName;

	@FindBy(xpath = "//textarea[@class=\"message\"]")

	private WebElement message;

	@FindBy(xpath = "//input[@value=\"Email a friend\"]")

	private WebElement fEmailBtn;

	@FindBy(xpath = "//input[@class=\"friend-email\"]")

	private WebElement emailFrnd;

	@FindBy(xpath = "//input[@name=\"send-email\"]")

	private WebElement sendEmailBtn;

	@FindBy(xpath = "//div[@class=\"result\"]")

	private WebElement successMsg;

}
