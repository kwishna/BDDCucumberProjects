import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import FrameworkOne.Utils.ResourceReader;
import static FrameworkOne.Utils.SeleniumDriverManager.*;

public class Rough {

	public static void main(String[] args) {
		
		getDriver().get(ResourceReader.readValue("url"));
		System.out.println(getDriver().findElement(By.xpath("//a[@href='http://www.globalsqa.com/']")));
		Actions act = new Actions(getDriver());
		act.moveToElement(getDriver().findElement(By.xpath("//a[@href='http://www.globalsqa.com/testers-hub/']"))).perform();

	}

}
