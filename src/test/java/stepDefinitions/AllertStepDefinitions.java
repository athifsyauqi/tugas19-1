//package stepDefinitions;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import pages.JSAllert;
//import utilities.AllertHandler;
//import utilities.DriverManager;
//
//public class AllertStepDefinitions {
//    @Given("I on web {string}")
//    public void userOnTheHomePage(String url) {
//        DriverManager.getDriver().get(url);
//    }
//
//    @Given("I click on Show Alert")
//    public void clickShowAllert() throws InterruptedException {
//        Thread.sleep(4000);
//        JSAllert jsAllert = new JSAllert();
//        jsAllert.clickbuttonShowAlert();
//        Thread.sleep(3000);
//
//    }
//
//    @Then("I should see alert message {string}")
//    public void verifyAllertMessage(String expectedAlertMessage) throws InterruptedException {
//        Thread.sleep(5000);
//        AllertHandler allertHandler = new AllertHandler();
//        String actualAllertMessage = allertHandler.getAlertText();
//        System.out.println("actualAllertMessage : " + actualAllertMessage);
//    }
//
//}
