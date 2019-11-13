package FrameworkOne.Utils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.service.DriverService;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriverManager {
	
	private static WebDriver driver;
	private static DriverService service;
	private static WebDriverWait wait;
	private static Wait<WebDriver> fluentWait;
	
	private SeleniumDriverManager() {
		
		
	}
	
	private static void startServer(String browser) {
		
		if(browser.equalsIgnoreCase("firefox")||browser.equalsIgnoreCase("mozilla")) {
			
			service = new GeckoDriverService.Builder().usingDriverExecutable(new File("E:\\geckodriver.exe")).usingAnyFreePort().build();
			try {
				service.start();
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
		
		else{
			
			service = new ChromeDriverService.Builder().usingDriverExecutable(new File("E:\\chromedriver.exe")).usingAnyFreePort().build();
			try {
				service.start();
			} catch (IOException e) {
				e.printStackTrace();
			}
	
		}		
	}
	
	public static WebDriver getDriver() {
		
		String browser = ResourceReader.readValue("browser");
		
		if(driver!=null) {
			
			return driver;
		}
		
//		startServer(browser);
		
		if(browser.equalsIgnoreCase("firefox")||browser.equalsIgnoreCase("mozilla")) {
			System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
			driver = new FirefoxDriver();
//			driver = new RemoteWebDriver(service.getUrl(), new FirefoxOptions());	
		}
		
		else{
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			driver = new ChromeDriver();
//			driver = new RemoteWebDriver(service.getUrl(), new ChromeOptions());
				
		}
		
		driver.manage().timeouts().implicitlyWait(Long.valueOf(ResourceReader.readValue("ImplicitTimeout")), TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, Long.valueOf(ResourceReader.readValue("WebDriverWaitTime")));
		fluentWait = new FluentWait<WebDriver>(driver)
				.pollingEvery(3, TimeUnit.SECONDS)
				.withTimeout(30, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
		return driver;		
	}
		
//	public static WebElement doFluentWait(By by) {	
//		return fluentWait.until(	
//				new Function<WebDriver, WebElement>(){
//					public WebElement apply(WebDriver driver) {
//					return driver.findElement(by);
//				}
//			});
//	}
	
	public static WebElement doFluentWaitAgain(By by) {	
		
		return fluentWait.until(			
				(driver)-> { return driver.findElement(by);	});
			}
	
	public static WebElement doWebDriverWaitAgain(ExpectedCondition<WebElement> expect) {	
		
		return wait.until(expect);
	}
	
	public static void stopDriver() {

//		service.stop();
		driver.close();
	}
}