package org.Cricket;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class AK {
	public static WebDriver driver;
	public static JavascriptExecutor js;
	@Test
	public static void AK1() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		 js=(JavascriptExecutor)driver;
		System.out.println("Launched");
	}
	@Test
	public void AK2() {
		WebElement acc=driver.findElement(By.xpath("//span[text()='Account']"));
		acc.click();
		System.out.println("clicked");
	}
	@Test
	public void AK3() {
		WebElement sign=driver.findElement(By.xpath("//span[text()='Login/ Sign Up']"));
		sign.click();
		System.out.println("clicked");
	}
	@Test
	public void Ak4() {
		try {
			Thread.sleep(4000);
			WebElement no=driver.findElement(By.id("mobileNoInp"));
			no.sendKeys("8903641748");;
			System.out.println("Number");	
		}catch (Exception e) {
			
		}
	}
}
