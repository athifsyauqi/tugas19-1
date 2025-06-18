package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.home.PopUpSignUp;
import utilities.AllertHandler;

public class HomeStepDefinitions {

    private PopUpSignUp popUpSignUp = new PopUpSignUp();

    @Given("I am on the home page")
    public void userOnTheHomePage(){
        //code to navigate to the home page
    }

    @When("I click on the signup link")
    public void clickOnSignUpLink(){
        HomePage homePage = new HomePage();
        homePage.clickSignUpLink();

    }

    @When("I fill the username field with {string}")
    public void fillUsernameField(String username) {
        if(username.equals("randomuser")){
            username = "cuktaw123" + System.currentTimeMillis();
        }

        popUpSignUp.enterUsername(username);

    }

    @When("I fill the password field with {string}")
    public void fillPasswordField(String password) {
        popUpSignUp.enterPassword(password);

    }

    @When("I click on the signup button")
    public void clickOnTheSignUpButton(){
        popUpSignUp.clickSignUpButton();

    }

    @Then("I should see a message {string}")
    public void verifyMessage(String expectedAlertMessage) throws InterruptedException {
        Thread.sleep(5000);
        AllertHandler allertHandler = new AllertHandler();
        String actualAllertMessage = allertHandler.getAlertText();
        System.out.println("actualAllertMessage : "+ actualAllertMessage);
        Assert.assertEquals("Alert message does not match", expectedAlertMessage, actualAllertMessage);

    }
}
