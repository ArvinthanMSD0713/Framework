package org.Cricket;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class IPL2008 {
	public static void main(String[] args) throws IOException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://demoqa.com/register");
//		WebElement name=driver.findElement(By.id("firstname"));
//		name.sendKeys("Arvinthan");
//		WebElement name1=driver.findElement(By.id("lastname"));
//		name1.sendKeys("Joshna");
//		WebElement username=driver.findElement(By.id("userName"));
//		username.sendKeys("ArvinthanMSD");
//		WebElement password=driver.findElement(By.id("password"));
//		password.sendKeys("ArvinthanJoshna13");
		File file=new File("C:\\Users\\RAMESH\\OneDrive\\Pictures\\FrameWork Data Driven\\Joshna.xlsx");
		FileOutputStream stream=new FileOutputStream(file);
		Workbook book=new XSSFWorkbook();
		Sheet createsheet=book.createSheet("Dhoni");
		Row createrow=createsheet.createRow(0);
		Cell createcell=createrow.createCell(0);
		createcell.setCellValue("FirstName");
		Cell createcell1=createrow.createCell(1);
		createcell1.setCellValue("Arvinthan");
		book.write(stream);
		Row createrow1=createsheet.createRow(1);
		Cell createcell2=createrow.createCell(0);
		createcell2.setCellValue("LastName");
		Cell createcell3=createrow.createCell(1);
		createcell3.setCellValue("Joshna");
		book.write(stream);
		Row createrow2=createsheet.createRow(2);
		Cell createcell4=createrow.createCell(0);
		createcell4.setCellValue("UserName");
		Cell createcell5=createrow.createCell(1);
		createcell5.setCellValue("ArvinthanMSD");
		book.write(stream);
		Row createrow3=createsheet.createRow(3);
		Cell createcell6=createrow.createCell(0);
		createcell6.setCellValue("Password");
		Cell createcell7=createrow.createCell(1);
		createcell7.setCellValue("ArvinthanJoshan13");
		book.write(stream);
	}

}
