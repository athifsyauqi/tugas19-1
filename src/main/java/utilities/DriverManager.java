package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if(driver == null) {

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless=new"); // Mode headless Chrome
            options.addArguments("--window-size=1920,1080"); // Ukuran layar virtual
            //Initialize the WebDriver instance here
            //For example, using ChromeDriver;

            driver = WebDriverManager.chromedriver().capabilities(options).create();
            driver.get("https://demoblaze.com/"); // Perbaiki format URL
        }
        return driver;
    }

//            driver = WebDriverManager.chromedriver().create();
//            driver.manage().window().maximize();
//            driver.get("https://demoblaze.com/");
//        }
//        return driver;
//    }

    public static void quitDriver(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }
}
