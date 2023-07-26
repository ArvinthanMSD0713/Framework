package org.Cricket;
import org.openqa.selenium.WebElement;
public class Joshna extends Arvinthan {
	public static void main(String[] args) {
		getDriver("https://www.facebook.com/");
		WebElement name=idLocator("email");
		name.sendKeys("arvinthanjoshna13@gmail.com");
		WebElement pass=xpathLocator("//input[@type='password']");
		pass.sendKeys("1234rtreasdff");
	}
}
