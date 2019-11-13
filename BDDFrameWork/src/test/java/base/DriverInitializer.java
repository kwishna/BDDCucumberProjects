package base;

import java.io.FileNotFoundException;

import java.io.IOException;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverInitializer {
	
	public static WebDriver driver;
	
	public WebDriver instantiateDriver() throws FileNotFoundException, IOException{
		ResourceBundle config = ResourceBundle.getBundle("Config");
		String browser = config.getString("browser");
		String driverPath = config.getString("driverpath");
		System.out.println();
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox")||browser.equalsIgnoreCase("mozilla")){
			System.setProperty("webdriver.gecko.driver", driverPath);
			driver = new FirefoxDriver();
		}
		else{
			System.out.println("By Default Using Chrome Driver");
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(config.getString("baseurl"));
		
		return driver;
	}
	
	
	public void closeBrowser(WebDriver driver){
		driver.close();
	}
}
