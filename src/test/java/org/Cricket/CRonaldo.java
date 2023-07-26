package org.Cricket;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class CRonaldo {
	public static WebDriver driver;  
	@BeforeClass
	public static void Launch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("Launched");
	}
	@Before
	public void name() {
		WebElement name=driver.findElement(By.name("email"));
		name.sendKeys("arvinthsn.ramesh13@gmail.com");
		System.out.println("arvinthsn.ramesh13@gmail.com");		
	}
	@Test
	public void pass() {
		WebElement pas=driver.findElement(By.name("pass"));
		pas.sendKeys("234567801");
		System.out.println("234567801");
	}
	@Test
	public void login() {
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		System.out.println("Clicked");
	}
	@AfterClass
	public static void check() throws InterruptedException {
		Thread.sleep(2000);
			String ExpectesdErrorMsg="The email address you entered isn't connected to an account.";
			WebElement error=driver.findElement(By.xpath("//div[@class='_9ay7']"));
			String ActualErrorMsg=error.getText();
			if(ExpectesdErrorMsg.equalsIgnoreCase(ActualErrorMsg)) {
				System.out.println("Error msg declared correctly");
			}else {
				System.out.println("Error msg declared incorrectly");
			}
	}
}
