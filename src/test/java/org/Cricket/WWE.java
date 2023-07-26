package org.Cricket;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class WWE {
	public static WebDriver driver;
	@Test(priority=1)
	public void Khali() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("Launched");
	}
	@Test(priority=42, enabled=false)
	public void Cena() {
		WebElement name=driver.findElement(By.name("email"));
		name.sendKeys("Arvinthan");
		System.out.println("Arvinthan");
	}
	@Test(priority=7, invocationCount=7)
	public void Rock() {
		WebElement pass=driver.findElement(By.name("pass"));
		pass.sendKeys("Arvinthanp2orhf");
		System.out.println("Arvinthanp2orhf");
	}
}
