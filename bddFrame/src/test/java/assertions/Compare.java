package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Compare {

	public static boolean validateUrl(WebDriver driver, String expected){
		
		boolean flag = false;
		
		if(driver.getCurrentUrl().equalsIgnoreCase(expected)){
			flag=true;
		}
		
		return flag;
	}
	
	public static boolean validateTitle(WebDriver driver, String expected){
		
		boolean flag = false;
		
		if(driver.getTitle().equalsIgnoreCase(expected)){
			flag=true;
		}
		
		return flag;
	}
	
	public static boolean validateXpath(WebDriver driver, String xpath){
		
		boolean flag = false;
		
		try {
			
			driver.findElement(By.xpath(xpath));
			flag=true;
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return flag;
	}
}
