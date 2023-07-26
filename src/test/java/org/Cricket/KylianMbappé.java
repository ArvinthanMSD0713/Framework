package org.Cricket;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class KylianMbappé {
	public static WebDriver driver;
	@BeforeClass
	public static void Launch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/account/login");
		System.out.println("Launched");
	}
	@Before
	public void no() {
		WebElement num=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		num.sendKeys("8903641748");
		System.out.println("8903641748");
	}
	@Test
	public  void otp() {
		WebElement req=driver.findElement(By.xpath("//button[text()='Request OTP']"));
		req.click();
		System.out.println("Clicked");
	}
}
