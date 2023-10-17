package stepDefinition1;

import PageObject.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseTest {
	
	LoginPage loginPage;
	
	@Given("open a browser")
	public void open_a_browser() {
		
		openBrowser();
		navigateUrl();
	   
	}

	@And("Navigate to Web shop page")
	public void navigate_to_web_shop_page() {
		
	}

	@And("click on Login link")
	public void click_on_login_link() {
		loginPage=new LoginPage(driver);
		loginPage.clickOnLoginLink();
	}

	@When("user enter the following details {string},{string}")
	public void user_enter_the_following_details(String Email, String Password) {
		loginPage.enterEmail(Email);
		loginPage.enterPass(Password);
	}

	@Then("Click on Login button")
	public void click_on_login_button() {
		loginPage.clickOnLoginButton();
	}
	
	@Then("Verify Login Title")
	public void verify_login_title() {
		loginPage.getLoginPageTitle();
	}
	
	@Then("Click on Electronice section link")
	public void click_on_electronice_section_link() {
		loginPage.clickOnElectronics();
	}

	@Then("Click on Cell phone link")
	public void click_on_cell_phone_link() {
		loginPage.clickOnCellPhones();
	}

	@Then("verify mobile is add to cart")
	public void verify_mobile_is_add_to_cart() {
		loginPage.clickOnAddToCart();
		loginPage.validateMsg();
	}

	@Then("Click on Shopping cart")
	public void click_on_shopping_cart() {
		loginPage.ClickOnShoppingcart();
	}

	@Then("Verify product is added or not")
	public void verify_product_is_added_or_not() {
		loginPage.VerifyShoppingcartProduct();
	}


}
