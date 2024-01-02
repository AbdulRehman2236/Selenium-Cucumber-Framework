package stepDefinitions;

import driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setup(){
        DriverManager.getDriver();
    }

    @After
    public void tearDown(){
        DriverManager.quitDriver();

    }
}
