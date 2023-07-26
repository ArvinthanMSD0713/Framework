package org.Cricket;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class BrettLee {
	public static WebDriver driver; 
	@Test (priority =10)
	private void name() {
		WebElement name=driver.findElement(By.name("email"));
		name.sendKeys("Joshan1326");
		System.out.println("Joshan1326");
	}
	@Test (priority =19)
	private void login() {
		WebElement log=driver.findElement(By.name("login"));
		log.click();
		System.out.println("Clicked");
	}
	@Test (priority =11)
	private void pass() {
		WebElement passw=driver.findElement(By.name("pass"));
		passw.sendKeys("asdgfh1234567");
		System.out.println("asdgfh1234567");
	}
	@Test (priority =1)
	private void launch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("Launched");
	}
	@Test (priority =1000000000)
	private void check() throws InterruptedException {
		Thread.sleep(2000);
		String exceptederrormsg="The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		WebElement errormsg=driver.findElement(By.xpath("//div[@class='_9ay7']"));
		String actualerrormsg=errormsg.getText();
		if(exceptederrormsg.equalsIgnoreCase(actualerrormsg)) {
			System.out.println("Error declared crtly");
		}else {
			System.out.println("Error declared incrtly");
		}
		
	}	
}
