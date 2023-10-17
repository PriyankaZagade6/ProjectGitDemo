package stepDefinition1;

import PageObject.WebShopPageObj;
import io.cucumber.java.en.*;
import junit.framework.Assert;

public class WebshopStep extends BaseTest {

	WebShopPageObj obj;

	@Given("I navigate to {string}")
	public void i_navigate_to(String url) {
		openBrowser();
		navigateUrl();
	}

	@When("I click on Register Link")
	public void i_click_on_register_link() {
		obj=new WebShopPageObj(driver);
		obj.getRegisterLink().click();
	}

	@And("I select gender")
	public void i_select_gender() {
		
		obj.getGender().click();
	}

	@And("I enter FirstName {string}")
	public void i_enter_first_name(String fName) {
		
		obj.getFirstName().sendKeys(fName);
	}

	@And("I enter LastName {string}")
	public void i_enter_last_name(String lName) {
		obj.getLastName().sendKeys(lName);
	}

	@And("I enter email {string}")
	public void i_enter_email(String email) {
		obj.getEmail().sendKeys(email);
	}

	@Then("I enter password {string}")
	public void i_enter_password(String pass) {
		obj.getPassword().sendKeys(pass);
	}

	@And("I enter confirmPass {string}")
	public void i_enter_confirm_pass(String cPass) {
		obj.getConfirmPass().sendKeys(cPass);
	}

	@And("I click on Register button")
	public void i_click_on_register_button() {
		
		obj.getRegisterBtn().click();
	}

	@Then("validate the {string} message")
	public void validate_the_message(String msg) {
		
		obj.getVerificationMsg().isDisplayed();
		closeBrowser();
		
	}

}
