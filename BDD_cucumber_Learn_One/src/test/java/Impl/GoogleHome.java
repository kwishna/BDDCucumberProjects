package Impl;

import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.*;

@SuppressWarnings("deprecation")
public class GoogleHome {
	
	WebDriver driver;
	
	@Given("i open a browser")
	public void i_open_a_browser() {
	   
		ChromeOptions cr = new ChromeOptions();
		driver = new ChromeDriver(cr);
		
	}

	@When("i navigate to {string}")
	public void i_navigate_to(String string) {
	    driver.get(string);
	}

	@Then("google homepage should open")
	public void google_homepage_should_open() {
		
	    Assert.assertTrue(driver.findElement(By.id("hplogo")).isDisplayed());
		
	}

	@Then("search box should be present")
	public void search_box_should_be_present() {
		Assert.assertTrue(driver.findElement(By.name("q")).isDisplayed());
	}

	@Then("zero search result.")
	public void zero_search_result() {
	    
		boolean isFail = false;
		
		try {
			
			driver.findElement(By.className("r"));
			
		} catch (Exception e) {
			
			isFail = true;
		}
		
		Assert.assertTrue(isFail);
		
	}
}
