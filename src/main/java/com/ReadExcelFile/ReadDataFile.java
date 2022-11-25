package com.ReadExcelFile;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFile {

	public static void main(String[] args) throws IOException {

		System.out.println("Welcome");
		System.out.println("My Project Path :: "+System.getProperty("user.dir"));
		//String path = System.getProperty("user.dir");	
		//XSSFWorkbook workbook = new XSSFWorkbook(path+"C:\\Users\\ASUS\\\\Documents\\Test1.xlsx");
		
		
		XSSFWorkbook workbook = new XSSFWorkbook("C:\\Users\\ASUS\\Documents\\Test1.xlsx");
		XSSFSheet sheet = workbook.getSheet("sheet1");
		
		
		System.out.println("Excell Row Count = "+sheet.getPhysicalNumberOfRows());
		
		System.out.println("Excell Cell Count = "+sheet.getRow(0).getPhysicalNumberOfCells());
		System.out.println("*****************ROW CALCULATION******************************");
		System.out.println("Row0 Col3 = "+sheet.getRow(0).getCell(2));
		
		
		System.out.println("*****************COLUME CALCULATION******************************");
		System.out.println("My Actual Data = "+sheet.getRow(0).getCell(0).getStringCellValue());
		System.out.println("My Row0 Col1 = "+sheet.getRow(4).getCell(1).getStringCellValue());
		
	}

}
