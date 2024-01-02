package stepDefinitions;

import driver.DriverManager;
import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.InventoryPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SauceDemoProductCheckoutSteps {

    WebDriver driver = DriverManager.getDriver();
    InventoryPage inventory = new InventoryPage(driver);
    CartPage cart = new CartPage(driver);
    CheckoutPage checkout = new CheckoutPage(driver);

    @When("the user selects {string} product")
    public void selectProduct(String productName){
        inventory.selectProduct(productName);
    }

    @Then("{string} product page should be visible")
    public void isProductPageVisible(String expectedProductName){
        String actualProductName = inventory.getProductHeading();
        Assert.assertEquals(actualProductName, expectedProductName);
    }

    @When("the user clicks Add to Cart button")
    public void clickAddToCartButton() {
        inventory.clickAddToCart();
    }

    @And("the user verify that number of items in cart is {string}")
    public void verifyNumberOfItemsInCart(String expectedItemsInCart) {
        String actualItemsInCart = inventory.numberOfItemsInCart();
        Assert.assertEquals(actualItemsInCart, expectedItemsInCart);
    }

    @And("the user open cart page")
    public void clickCartIcon() {
        inventory.clickCartIcon();
    }

    @Then("Remove button should be visible")
    public void isRemoveButtonVisible() {
        boolean removeButton = inventory.isRemoveButtonVisible();
        Assert.assertTrue(removeButton);
    }

    @When("the user clicks Checkout button")
    public void clickCheckoutButton() {
        cart.clickCheckout();
    }

    @And("the user enters firstname {string}")
    public void enterFirstName(String firstName) {
        checkout.enterFirstName(firstName);
    }

    @And("the user enters lastname {string}")
    public void enterLastName(String lastName) {
        checkout.enterLastName(lastName);
    }

    @And("the user enters postal code {string}")
    public void enterPostalCode(String postalCode) {
        checkout.enterPostalCode(postalCode);
    }

    @When("the user clicks on Continue button")
    public void clickContinueButton() {
        checkout.clickContinueButton();
    }

    @Then("Checkout Overview page should be visible")
    public void isCheckoutPageVisible(){
        String expectedCheckoutPageTitle = "Checkout: Overview";
        String actualCheckoutPageTitle = checkout.isCheckoutPageVisible();
        Assert.assertEquals(actualCheckoutPageTitle,expectedCheckoutPageTitle);
    }

    @When("the user clicks Finish button")
    public void clickFinishButton() {
        checkout.clickFinishButton();
    }

    @Then("the user verify order is successfully dispatched")
    public void verifyOrderIsSuccessful(){
        String expectedMessage = "Thank you for your order!";
        String actualMessage = checkout.isOrderSuccessful();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

}
