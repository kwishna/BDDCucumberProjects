package utils;

import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {
    private WebDriver driver;
    public int x;
    public Driver(){
        driverInitialization();
        System.out.println("Driver Initializedx");
    }

    private void driverInitialization(){
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
        System.out.println("Starting driver.");
        var browserName = "chrome";
        switch (browserName.toLowerCase()){
            case "chrome":
                System.out.println("Starting chrome");
                driver = new ChromeDriver();
                System.out.println("Before break.");
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                throw new NotFoundException("Browser not found: " + browserName);
        }
    }
    
//    public void initializeDriver() {
//    	
//    	driverInitialization();
//    }

    public WebDriver getDriver(){
    	System.out.println("Calling Get Driver");
        return driver;
    }

    public WebDriverWait getWebDriverWait(){
        return new WebDriverWait(driver, 120);
    }

    public void terminateDriver(){
        System.out.println("Terminating driver.");
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }
}
