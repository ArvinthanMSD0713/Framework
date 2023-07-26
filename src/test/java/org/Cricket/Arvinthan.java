package org.Cricket;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Arvinthan {
	public static WebDriver driver;
	public static void getDriver(String url) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);		
	}
	public static WebElement idLocator(String id) {
		WebElement name=driver.findElement(By.id(id));
		return name;
	}
	public static WebElement xpathLocator(String xpathExpression) {
		WebElement pass=driver.findElement(By.xpath(xpathExpression));
		return pass;
	}
}
