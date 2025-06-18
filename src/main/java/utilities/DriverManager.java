package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class DriverManager {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if(driver == null) {
            //Initialize the WebDriver instance here
            //For example, using ChromeDriver;

            driver = WebDriverManager.chromedriver().create();
            driver.manage().window().maximize();
            driver.get("https://demoblaze.com/");
        }
        return driver;
    }

    public static void quitDriver(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }
}
