package utils;

import org.openqa.selenium.WebDriver;

public class DI {
	
	private Driver drive;
	private WebDriver driver;
	public int x = 11;
	
	public void setDiDriver() {
		drive = new Driver();
//		drive.initializeDriver();
		driver = drive.getDriver();
		
	}
	
	public WebDriver getDiDriver() {
		return driver;
	}
	
	public void closeDiDriver() {
		drive.terminateDriver();
	}
	

}
