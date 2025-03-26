package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCreate {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\asus\\eclipse-workspace\\DataDriven_Framework1\\Excelsheet\\test data.xlsx");
		
		FileInputStream stream = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(stream);
		
		Sheet sheet = wb.createSheet("raja");
		Row row = sheet.createRow(1);
		Cell cell = row.createCell(0);
		cell.setCellValue("Raja@2435");
		
		FileOutputStream fh = new FileOutputStream(f);
		
		wb.write(fh);
		
		System.out.print("-----Ending---");
		
		wb.close(); 
		
	}

}
