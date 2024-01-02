package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private final WebDriver driver;

    private final By elemCheckout = By.id("checkout");

    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickCheckout(){
        driver.findElement(elemCheckout).click();
    }
}
