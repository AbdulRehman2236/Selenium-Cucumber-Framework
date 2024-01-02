package stepDefinitions;

import driver.DriverManager;
import pageObjects.InventoryPage;
import pageObjects.LoginPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SauceDemoLoginSteps{

    WebDriver driver = DriverManager.getDriver();
    LoginPage login = new LoginPage(driver);
    InventoryPage inventory = new InventoryPage(driver);

    @Given("the user is on the Sauce Demo login page")
    public void navigateToLoginPage() {
        login.navigateToLoginPage();
    }

    @When("the user enters username {string}")
    public void enterUserName(String username) {
        login.enterUserName(username);
    }

    @And("the user enters password {string}")
    public void enterPassword(String password) {
        login.enterPassword(password);
    }

    @And("the user clicks the login button")
    public void clickLoginButton() {
        login.clickLoginButton();
    }

    @Then("the user should be logged in successfully")
    public void verifyLoginIsSuccessful() {
        String actualTitle = inventory.isUserOnInventoryPage();
        Assert.assertEquals("Products", actualTitle);
    }

    @Then("the user should see an error message {string}")
    public void verifyLoginIsFailed(String expectedError) {
        String actualError = login.isLoginFailed();
        Assert.assertEquals(expectedError, actualError);
    }
}
