package org.Cricket;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Neymar {
	public static WebDriver driver;
	@BeforeClass
	public static void launch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/register");
		System.out.println("Launched");
	}
	@Before
	public void name() {
		WebElement name=driver.findElement(By.id("firstname"));
		name.sendKeys("Arvinthan");
		System.out.println("Arvinthan");
	}
	@Test
	public void last() {
		WebElement lname=driver.findElement(By.id("lastname"));
		lname.sendKeys("R");
		System.out.println("R");
	}
	@After
	public void user() {
		WebElement uname=driver.findElement(By.id("userName"));
		uname.sendKeys("ArvinthanJoshna");
		System.out.println("ArvinthanJoshna");
	}	
	@After
	public void pass() {
		WebElement passw=driver.findElement(By.id("password"));
		passw.sendKeys("ArvinthanJoshna123456");
		System.out.println("ArvinthanJoshna123456");
	}	
	@AfterClass
	public static void click() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement cli=driver.findElement(By.id("password"));
		js.executeScript("arguments[0].scrollIntoView(true)", cli);
		js.executeScript("arguments[0].click()", cli);
		System.out.println("Clicked");
		WebElement reg=driver.findElement(By.id("register"));
		reg.click();
		System.out.println("Register");
	}	
}
