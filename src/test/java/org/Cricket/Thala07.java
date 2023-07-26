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
public class Thala07 {
	public static void main(String[] args) throws IOException {
		File file=new File("G:\\Arvinthan.xlsx");
		FileOutputStream stream=new FileOutputStream(file);
		Workbook book=new XSSFWorkbook();
		Sheet createsheet=book.createSheet("Joshna");
		Row createrow=createsheet.createRow(0);
		Cell createcell=createrow.createCell(0);
		createcell.setCellValue("MSD");
		book.write(stream);
	}

}