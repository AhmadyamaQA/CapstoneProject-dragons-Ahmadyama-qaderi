package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {
	POMFactory factory = new POMFactory();
	
	@When("User  click on Sign in option") 
	public void userClickOnSignInOption() {
		click(factory.homePage().signin);
		logger.info("user clicked on sign in option succefully");
		
	}
	
	@And("User enter  email {string} and password {string}")
	public void userEnterEmailAndPassword (String email,String password) {
		sendText(factory.signInPage().emailField,email);
		sendText(factory.signInPage().passwordField,password);
		logger.info("user entered email" + email + "and password" + password);
		
		
	}
	
	@And("User click  on login button")
	public void userClickOnLoginButton () {
		click(factory.signInPage().loginButton);
		logger.info("user clicked on login button");
		
		
	}
	
	@And("User should be logged in into  account")
	public void user_ShouldBeLoggedInIntoAccount () {
		Assert.assertTrue(isElementDisplayed(factory.homePage().account));
		logger.info("User could login successfully");
		
	}
	
	@And("User click on Orders section")
	public void userClickOnOrderSection() {
		click(factory.orderPage().orderbttn);
		logger.info("User clicked on Order Section");
		
	}
	
	@And("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		click(factory.orderPage().showdetails);
		logger.info("User clicked on first order from the list");
		
		
	}
	
	
	//@CancelOrder
	
	@And("User click on Cancel The Order button")
	public void userClickOnCanceltheOrderButton() {
		click(factory.orderPage().cancelbttn);
		logger.info("User clicked on Cancel The Order Button");
	}
	
	@And("User select the cancelation Reason {string}")
	public void userSelectBoughtWrongItem(String BWI) {
		sendText(factory.orderPage().reason,BWI);
		logger.info("User picked 'Bought Wrong Item' from list");
		
	}
	
	@And("User click on Cancel Order button")
	public void userClickOnCancelOrderButtn() {
		click(factory.orderPage().cancelOrderBttn);
		logger.info("User clicked on 'Cancel Order Button");
		
	}
	
	@Then("a cancelation message should be displayed Your Order Has Been Cancelled")
	public void aCancelationMsgShouldBeDisplayed() {
		Assert.assertTrue(isElementDisplayed(factory.orderPage().yourOrderHasBeenCancelled));
		logger.info("A message displayed as 'Your Order Has Been Cancelled'");
			
	}
	
	
	
	
	
	// @ReturnOrder
	
	@And("User click on Return Items button")
	public void userClickedonReturnItemsBttn() {
		click(factory.orderPage().returnbtn);
		logger.info("User clicked on Return Items Button");
		
	}
	
	@And("User select the Return {string}")
	public void userSelectTheReturnReasonDamaged(String RID) {
		sendText(factory.orderPage().inputreason,RID);
		logger.info("User Select Reason Item Damaged");
		
	}
	
	@And("User select the drop off service {string}")
	public void userSelecttheDropOfFedex(String fedex) {
		sendText(factory.orderPage().dropOfInput,fedex);
		logger.info("User select the drop off as Fedex");
		
	}
	
	@And("User click on Return Order button")
	public void userClickedOnReturnOrderBtn() {
		click(factory.orderPage().returnButton);
		logger.info("User click on Return Order button");
		
	}
	
	@Then("a cancelation message should be displayed Return was successful")
	public void aMsg_should_BePresentAs_returnWassuccessful() {
		Assert.assertTrue(isElementDisplayed(factory.orderPage().yourOrderReturn));
		logger.info("A cancelation message popped up on the top of the page");
	}
	
	
	
	//@WrittingReview
	@And("User click on Review button")
	public void userClickedOnReviewButton() {
		click(factory.orderPage().reviewBtn);
		logger.info("User click on Review Button");
		
	}
	
	@And("User write Review headline {string} and {string}")
	public void userWriteAReview(String headline, String text ) {
		sendText(factory.orderPage().headlineInput,headline);
		sendText(factory.orderPage().descriptionInput,text);
		logger.info("User write review on headline and review text");
		
	}
	
	@And("User click Add your Review button")
	public void userClickedAddYourReviewButton() {
		click(factory.orderPage().reviewSubmitBtn);
		logger.info("User click add review button");
		
	}
	
	@Then("a review message should be displayed Your review was added successfully")
	public void aMsgShouldBeDipsplayed() {
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.orderPage().Msg));
		logger.info("A message diplayed Your Review Was Added Successfully");
		
	}
	

}
