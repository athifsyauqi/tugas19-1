package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JSAllert extends BasePage{
    @FindBy(xpath = "//button[@data-test='alert-button']")
    WebElement buttonShowAlert;

    public void clickbuttonShowAlert(){
        buttonShowAlert.click();
    }



}
