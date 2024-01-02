package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InventoryPage {
    private final WebDriver driver;

    private final By elemTitle = By.className("title");
    private final By elemAddToCart = By.cssSelector(".btn_inventory");
    private final By elemCartIcon = By.className("shopping_cart_badge");
    private final By elemMenuIcon = By.id("react-burger-menu-btn");
    private final By elemLogout = By.id("logout_sidebar_link");
    private final By elemProductName = By.cssSelector(".inventory_details_name");
    private final By elemRemoveButton = By.id("remove-sauce-labs-bike-light");
    private By getElemProductName(String productName){
        String xpathSelector = "//*[text()=\"%s\"]";
        return By.xpath(String.format(xpathSelector, productName));
    }

    public InventoryPage(WebDriver driver){
        this.driver = driver;
    }

    public String isUserOnInventoryPage(){
        WebElement productTitle = driver.findElement(elemTitle);
        return productTitle.getText();
    }

    public void selectProduct(String productName){
        WebElement cartItem = driver.findElement(getElemProductName(productName));
        cartItem.click();
    }
   public String getProductHeading(){
        WebElement productName = driver.findElement(elemProductName);
        return productName.getText();
   }

    public void clickAddToCart() {
         driver.findElement(elemAddToCart).click();
    }

    public String numberOfItemsInCart(){
        WebElement itemsInCart = driver.findElement(elemCartIcon);
        return itemsInCart.getText();
    }

    public void clickCartIcon(){
         driver.findElement(elemCartIcon).click();
    }

    public boolean isRemoveButtonVisible(){
        return driver.findElement(elemRemoveButton).isDisplayed();
    }

    public void clickMenuIcon(){
        driver.findElement(elemMenuIcon).click();
    }

    public void clickLogoutButton(){
        Duration timeout = Duration.ofSeconds(20);
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(elemLogout));
        driver.findElement(elemLogout).click();
    }


}
