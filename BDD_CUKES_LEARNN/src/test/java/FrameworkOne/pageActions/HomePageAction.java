package FrameworkOne.pageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import FrameworkOne.pages.HomePage;

public class HomePageAction{
	
	private Actions act;
	private HomePage homepage = null;
	
	public HomePageAction(WebDriver driver) {
		
		this.homepage = new HomePage(driver);
		act = new Actions(driver);
		PageFactory.initElements(driver, homepage);	
	}
	
	public void moveToTesterHub() {
		
		act.moveToElement(homepage.testersHub).perform();
	}
	
	public void moveToDemoTestSite() {
		
		act.moveToElement(homepage.DemoTestingSite).perform();
	}
	
	public void clickOnSelectElements() {
		
		homepage.SelectElements.click();
	}
	
	public boolean isHomePageDisplayed() {
		
		return homepage.homePageImage.isDisplayed();
	}
	
	public boolean isSelectElementPageDisplayed() {
		
		return homepage.SelectElementPage.isDisplayed();	
	}
}
