package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(id = "signin2")
    WebElement signUpLink;

    @FindBy(id = "login2")
    WebElement loginLink;

    public void clickSignUpLink(){
        signUpLink.click();
    }

    public void clickLoginLink(){
        loginLink.click();
    }
}
