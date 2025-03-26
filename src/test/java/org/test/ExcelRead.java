package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\asus\\eclipse-workspace\\DataDriven_Framework1\\Excelsheet\\test data.xlsx");
		
		FileInputStream stream = new FileInputStream(f); 
		
		Workbook wb = new XSSFWorkbook(stream);
		Sheet sheet = wb.getSheet("data");
//		Row row = sheet.getRow(2);
//		Cell cell = row.getCell(0);
//		String stringCellValue = cell.getStringCellValue();
//		System.out.println(stringCellValue);
//		wb.close();
//		
		for(int i=1;i<sheet.getPhysicalNumberOfRows();i++) {
			Row row = sheet.getRow(i); 
			for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
				Cell cell = row.getCell(j);
				
				DataFormatter formatter = new DataFormatter();
				String formatCellValue = formatter.formatCellValue(cell);
				System.out.println(formatCellValue);
				
				wb.close(); 
			
			
				
			}
			
		}
		
	}
	

}
