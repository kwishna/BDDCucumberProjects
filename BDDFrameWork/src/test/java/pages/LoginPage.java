package pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	ResourceBundle config;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		config = ResourceBundle.getBundle("elements");
		//PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String user) throws FileNotFoundException, IOException{
		driver.findElement(By.id(config.getString("username_id"))).clear();
		driver.findElement(By.id(config.getString("username_id"))).sendKeys(user);
	}
	
	public void enterPassword(String password) throws FileNotFoundException, IOException{
		driver.findElement(By.id(config.getString("password_id"))).clear();
		driver.findElement(By.id(config.getString("password_id"))).sendKeys(password);
	}
	
	public void clickSubmit() throws FileNotFoundException, IOException{
		driver.findElement(By.id(config.getString("submit_btn"))).click();
	}
	
	public void getTitle(){
		driver.getTitle();
	}
	
	public void gotoHomePage(){
		driver.get("https://www.facebook.com");
	}
	/**
	 * 
	public void enterMailId(String mail){
		mailIdBox.clear();
		mailIdBox.sendKeys("email@send");
	}
	
	
	public void clickReset(){
		resetButton.click();
	}
	*/
	
	
}
