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
public class CSK {
	public static void main(String[] args) throws IOException {
		File file=new File("G:\\CSk.xlsx");
		FileOutputStream stream=new FileOutputStream(file);
		Workbook book=new XSSFWorkbook();
		Sheet createsheet=book.createSheet("Dhoni");
		Row createrow=createsheet.createRow(0);
		Cell createcell=createrow.createCell(0);
		createcell.setCellValue("arvinthan");
		Cell createcell1=createrow.createCell(1);
		createcell1.setCellValue("joshna");
		book.write(stream);
		book.write(stream);
	}

}
