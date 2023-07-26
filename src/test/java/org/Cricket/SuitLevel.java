package org.Cricket;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class SuitLevel {
	public WebDriver driver;
	@Test(priority=0)
	private void csk() {
		try {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://adactinhotelapp.com/");
			System.out.println("Launched");
		} catch(Exception e) {
		}
	}
	@Test(priority=1)
	private void rcb() {
		try {
			WebElement name=driver.findElement(By.name("username"));
			name.sendKeys("Asdfghjkjhcvbnmkjh");
			WebElement pass=driver.findElement(By.name("password"));
			pass.sendKeys("876redfghjkjhgf");
			System.out.println("In-valid Crendentials are Entered");
		} catch(Exception e) {
		}
	}
	@Test(priority=2)
	private void mi() {
		try {
			WebElement login=driver.findElement(By.name("login"));
			login.click();
			System.out.println("login successfully");
		} catch(Exception e) {	
		}
	}
	@Test(priority=3)
	private void rpsg() {
		try {
			String ExpectedErrorMessage="Invalid Login details or Your Password might have expired. Click here to reset your password";
			WebElement ErrorMessage=driver.findElement(By.xpath("//div[@class='auth_error']"));
			String ActualErrorMessage=ErrorMessage.getText();
			// if condition
//			if(ExpectedErrorMessage.equalsIgnoreCase(ActualErrorMessage)) {
//				System.out.println("Error msg declared successfully");
//			} else {
//				System.out.println("Error not thrown ");
//			}
		    // Assert
			Assert.assertEquals(ActualErrorMessage, ExpectedErrorMessage);
			System.out.println("Error msg declared successfully");
			Assert.assertNotEquals(ActualErrorMessage, ExpectedErrorMessage);
			System.out.println("Error msg not there");
		} catch(Exception e) {
		}
	}
}
