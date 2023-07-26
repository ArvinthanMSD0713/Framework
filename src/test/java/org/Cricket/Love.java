package org.Cricket;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.ThreadSafe;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Love {
	public static WebDriver driver;
	@BeforeClass
	public static void IPL() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("Launched");
	}
	@Before
	public void WCt20() {
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("Arvinthan");
		System.out.println("Arvinthan");
	}
	@Test
	public void WC() {
		WebElement pass=driver.findElement(By.name("pass"));
		pass.sendKeys("ArvinthanJoshna23456");
		System.out.println("ArvinthanJoshna23456");
	}
	@After
	public void CT() {
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		System.out.println("login");
	}
	@AfterClass
	public static void AsiaCup() {
		try {
			Thread.sleep(4000);
			WebElement pass=driver.findElement(By.name("pass"));
			pass.sendKeys("ArvinthanJoshna23456");
			System.out.println("ArvinthanJoshna23456");	
		} catch(Exception e) {
			
		}
	}
}
