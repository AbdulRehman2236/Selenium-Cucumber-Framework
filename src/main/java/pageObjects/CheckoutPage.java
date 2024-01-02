package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
    private final WebDriver driver;

    private final By elemFirstName = By.id("first-name");
    private final By elemLastName= By.id("last-name");
    private final By elemPostalCode =By.id("postal-code");
    private final By elemContinue = By.id("continue");
    private final By elemFinish = By.id("finish");
    private final By elemOrderHeader = By.className("complete-header");
    private final By elemCheckoutPage = By.className("title");

    public CheckoutPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterFirstName(String firstname){
        driver.findElement(elemFirstName).sendKeys(firstname);
    }

    public void enterLastName(String lastname){
        driver.findElement(elemLastName).sendKeys(lastname);
    }

    public void enterPostalCode(String postalCode){
        driver.findElement(elemPostalCode).sendKeys(postalCode);
    }
    public void clickContinueButton(){
        driver.findElement(elemContinue).click();
    }

    public String isCheckoutPageVisible(){
        WebElement checkoutPage = driver.findElement(elemCheckoutPage);
        return checkoutPage.getText();
    }

    public void clickFinishButton(){
        driver.findElement(elemFinish).click();
    }

    public String isOrderSuccessful(){
        WebElement orderPlacementText = driver.findElement(elemOrderHeader);
        return orderPlacementText.getText();
    }


}
