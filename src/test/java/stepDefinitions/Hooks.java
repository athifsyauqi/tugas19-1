package stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.DriverManager;

public class Hooks {

    @Before
    public void setup(){
        DriverManager.getDriver();
    }

    @After
    public void quit(){
        DriverManager.quitDriver();
    }
}