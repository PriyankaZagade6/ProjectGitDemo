package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ComputerPage {
	
	WebDriver driver;

	 

	public void overOnComputer() {

 

		Actions actions = new Actions(driver);

		actions.moveToElement(computerLink).build().perform();

 

	}

 

	public void clickOnDesktop() {

 

		desktopLink.click();

	}

 

	public void sortProduct() {

 

		Select select = new Select(sortProduct);

		select.selectByVisibleText("Name: A to Z");

	}

 

	public void selectProduct() {

 

		selectProduct.click();

	}

 

	public void clkOnCompareList() {

 

		addCmpListBtn.click();

	}

 

	public void clkOnLogOut() {

 

		logoutBtn.click();

	}

 

	public ComputerPage(WebDriver driver) {

 

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

 

	@FindBy(xpath = "(//a[@href=\"/computers\"])[1]")

	private WebElement computerLink;

 

	@FindBy(xpath = "(//a[@href=\"/desktops\"])[1]")

	private WebElement desktopLink;

 

	@FindBy(xpath = "//select[@id=\"products-orderby\"]")

	private WebElement sortProduct;

 

	@FindBy(xpath = "//img[@alt=\"Picture of Build your own expensive computer\"]")

	private WebElement selectProduct;

 

	@FindBy(xpath = "//input[@value=\"Add to compare list\"]")

	private WebElement addCmpListBtn;

 

	@FindBy(xpath = "//a[@class=\"ico-logout\"]")

	private WebElement logoutBtn;

}
