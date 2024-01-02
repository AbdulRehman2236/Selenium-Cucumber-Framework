package stepDefinitions;

import driver.DriverManager;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.InventoryPage;
import pageObjects.LoginPage;

public class SauceDemoLogoutSteps {

    WebDriver driver = DriverManager.getDriver();
    InventoryPage inventory = new InventoryPage(driver);
    LoginPage login = new LoginPage(driver);

    @When("the user clicks on menu icon")
    public void clickMenuIcon() {
        inventory.clickMenuIcon();
    }

    @And("the user clicks on Logout button")
    public void clickLogoutButton() {
        inventory.clickLogoutButton();
    }

    @Then("the user should be logout successfully")
    public void isUserLogout() {
        Boolean userLogout =login.isUserLogout();
        Assert.assertTrue(userLogout);
    }
}
