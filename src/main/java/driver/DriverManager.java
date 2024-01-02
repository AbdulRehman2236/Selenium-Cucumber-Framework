package driver;

import utils.ConfigurationManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverManager {

    private static WebDriver driver = null;
    private static WebDriver createDriver(){
        String browserName = ConfigurationManager.getBrowserName();

        if (browserName == null) throw new IllegalArgumentException("Browser name cannot be null");

        switch ((browserName).toLowerCase()){
                case "chrome":
                    driver = new ChromeDriver();
                     break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported browser type: " + browserName);
        }

        driver.manage().window().maximize();
        return driver;
    }

    public static WebDriver getDriver(){
        if(driver == null){
            driver = createDriver();
        }
        return driver;
    }


    public static void quitDriver(){
         driver.quit();
         driver = null;
    }
}
