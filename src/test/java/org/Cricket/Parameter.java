package org.Cricket;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Parameter {
	public static WebDriver driver;
	@Test(priority=1)
	private void para() {
		try {
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.facebook.com/");
		System.out.println("Launched Successfully");
	}catch(Exception e) {
	}	
	}
	@Parameters({"user","pass"})
	@Test(priority=2)
	private void meter(@Optional("Arvinthan")String email,@Optional("Arvinthan23t4fdsdf")String pass) {
		try {
		WebElement name=driver.findElement(By.name("email"));
		name.sendKeys(email);
		WebElement passw=driver.findElement(By.name("pass"));
		passw.sendKeys(pass);
	}catch(Exception e) {
	}
	}
}
