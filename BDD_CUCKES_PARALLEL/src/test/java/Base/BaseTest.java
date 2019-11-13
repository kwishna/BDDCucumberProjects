package Base;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class BaseTest {
	
	private WebDriver driver;
	public static ThreadLocal<WebDriver> dr = new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriver() {
		
		return dr.get();
	}
	
	public static void setDriver(WebDriver driver) {
		
		dr.set(driver);
	}
	
	protected void startBrowser(String browserName) {
		
		if(browserName.equalsIgnoreCase("edge")) {
			
			System.setProperty("webdriver.edge.driver", "E:\\MicrosoftWebDriver.exe");
			driver = new EdgeDriver();		
		}
		
		else if(browserName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			driver = new ChromeDriver();		
		}
		
		else if(browserName.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
			driver = new FirefoxDriver();		
		}
		
		else {
			
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		setDriver(driver);
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		getDriver().manage().window().maximize();	
	}
	
	protected void navigateTo(String url) {
		
		getDriver().navigate().to(url);
	}
	
	protected void stopDriver() {
		
		getDriver().close();	
	}
	
	public static void captureScreenshot() throws IOException {
		
		File screenshot = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
		File sink = new File(System.getProperty("user.dir")+"/Resources/screenshot/"+String.join("_", LocalDateTime.now().toString().split("[^A-Za-z0-9]"))+".PNG");		
		Files.copy(screenshot, sink);

	}
	
}
