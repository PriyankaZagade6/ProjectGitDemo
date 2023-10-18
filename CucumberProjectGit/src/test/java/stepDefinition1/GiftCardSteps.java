package stepDefinition1;

import PageObject.GiftCardPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GiftCardSteps extends BaseTest {
	GiftCardPage GiftPage;
	@When("user navigates to Gift cards")
	public void user_navigates_to_gift_cards() {
		 GiftPage=new GiftCardPage(driver);
		 GiftPage.ClickOnGiftCardLink();
	}

	@Then("user clicks on any one physical gift card")
	public void user_clicks_on_any_one_physical_gift_card() {
		 GiftPage.clickOnForthCard();
	}

	@Then("user enters Recepients name {string} and Message {string}")
	public void user_enters_recepients_name_and_message(String string, String string2) {
		 GiftPage.enterName(string);
		 GiftPage.enterMessage(string2);
	}

	@Then("user clicks on Email a friend button")
	public void user_clicks_on_email_a_friend_button() {
		 GiftPage.clickFrndEmailBtn();
	}

	@Then("user enters Friend's email {string}")
	public void user_enters_friend_s_email(String string) {
		 GiftPage.enterEmailFrnd(string);
	}

	@Then("user clicks on send email button")
	public void user_clicks_on_send_email_button() {
		 GiftPage.clickOnSendBtn();
	}

	@Then("user verifys message obtain")
	public void user_verifys_message_obtain() {
		 GiftPage.Vmsg();
	}

}
