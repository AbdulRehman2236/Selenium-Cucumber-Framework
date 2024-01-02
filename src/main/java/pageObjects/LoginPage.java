package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private final WebDriver driver;

    private final By elemUserName = By.id("user-name") ;
    private final By elemPassword= By.id("password");
    private final By elemLogin = By.id("login-button");
    private final By elemError = By.cssSelector("[data-test='error']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void navigateToLoginPage(){
        driver.get("https://www.saucedemo.com/");
    }

    public void enterUserName(String username){
         driver.findElement(elemUserName).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(elemPassword).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(elemLogin).click();
    }

    public String isLoginFailed(){
        WebElement errorText = driver.findElement(elemError);
        return errorText.getText();
    }

    public Boolean isUserLogout(){
        WebElement loginButton = driver.findElement(elemLogin);
        return loginButton.isDisplayed();
    }
}
