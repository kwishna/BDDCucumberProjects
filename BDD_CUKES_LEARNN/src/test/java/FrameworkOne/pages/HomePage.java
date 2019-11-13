package FrameworkOne.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	
	private Actions act;

		public HomePage(WebDriver driver) {
		act = new Actions(driver);
	}
	
	@FindBy(how=How.XPATH, using="//a[@href='http://www.globalsqa.com/']")
	public WebElement homeLink;
	
	@FindBy(how=How.XPATH, using="//a[@href='http://www.globalsqa.com/about-the-company/']")
	public WebElement aboutUs;
	
	@FindBy(how=How.XPATH, using="//a[@href='http://www.globalsqa.com/testers-hub/']")
	public WebElement testersHub;
	
	@FindBy(how=How.XPATH, using="//a[@href='http://www.globalsqa.com/trainings/']")
	public WebElement trainings;
	
	@FindBy(how=How.XPATH, using="//a[@href='http://www.globalsqa.com/contact-us/']")
	public WebElement contactUs;
	
	@FindBy(how=How.XPATH, using="//a[@href='http://www.globalsqa.com/demo-site/']")
	public WebElement DemoTestingSite;
	
	@FindBy(how=How.XPATH, using="//a[@href='http://www.globalsqa.com/demo-site/select-elements/']")
	public WebElement SelectElements;
	
	@FindBy(how=How.XPATH, using="//a[@title='GlobalSQA']")
	public WebElement homePageImage;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"wrapper\"]/div[1]/div[1]/div/div/div/div[2]/h1")
	public WebElement SelectElementPage;
	
	public void moveToTesterHub() {
		act.moveToElement(testersHub).perform();;
	}
	
	public void moveToDemoTestSite() {	
		act.moveToElement(DemoTestingSite).perform();;
	}
	
	public void clickOnSelectElements() {	
		SelectElements.click();
	}
	
	public boolean isHomePageDisplayed() {
		return homePageImage.isDisplayed();
		
	}
	
	public boolean isSelectElementPageDisplayed() {
		return SelectElementPage.isDisplayed();
		
	}
	
}
