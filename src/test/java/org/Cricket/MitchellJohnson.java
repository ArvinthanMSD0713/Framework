package org.Cricket;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class MitchellJohnson {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().firefoxdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		WebDriver driver1=new FirefoxDriver();
		driver1.get("http://www.greenstechnologys.com/");
	}
}
