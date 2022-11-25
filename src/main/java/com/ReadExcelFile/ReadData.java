package com.ReadExcelFile;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {
		//my project path = XSSFWorkbook("C:\\Users\\ASUS\\eclipse-workspace\\1stMAVENproject\\ExcellFile\\DemoFile.xlsx 
		System.out.println("Hii");
		
		System.out.println("My Project Path :: "+System.getProperty("user.dir"));
	//	String path = System.getProperty("user.dir");
	//	XSSFWorkbook workbook = new XSSFWorkbook("C:\\Users\\ASUS\\eclipse-workspace\\1stMAVENproject\\ExcellFile\\DemoFile.xlsx");	
	//	XSSFWorkbook workbook = new XSSFWorkbook(path+"\\ExcellFile\\DemoFile.xlsx");
	//	XSSFSheet sheet = workbook.getSheet("sheet1");
		
		//my Excel path = //C:\\Users\\ASUS\\Documents\\sum.xlsx
		XSSFWorkbook workbook = new XSSFWorkbook("//C:\\Users\\ASUS\\Documents\\sum.xlsx");
	    XSSFSheet sheet = workbook.getSheet("sheet1");
		
		
		System.out.println("Excell Row Count = "+sheet.getPhysicalNumberOfRows());
		
		System.out.println("Excell Cell Count = "+sheet.getRow(0).getPhysicalNumberOfCells());
		System.out.println("*****************ROW CALCULATION******************************");
		System.out.println("Row0 Col3 = "+sheet.getRow(0).getCell(3));
		System.out.println("Row1 Col3 = "+sheet.getRow(1).getCell(3));
		System.out.println("Row2 Col3 = "+sheet.getRow(2).getCell(3));
		System.out.println("Row3 Col3 = "+sheet.getRow(3).getCell(3));
		System.out.println("Row4 Col3 = "+sheet.getRow(4).getCell(3));
		System.out.println("Row5 Col0 = "+sheet.getRow(5).getCell(0));
		
		System.out.println("*****************COLUME CALCULATION******************************");
		System.out.println("My Actual Data: "+sheet.getRow(0).getCell(0).getStringCellValue());
		
		System.out.println("My Row0 Col1: "+sheet.getRow(0).getCell(1).getStringCellValue());
		System.out.println("My Row0 Col2: "+sheet.getRow(0).getCell(2).getStringCellValue());
		System.out.println("My Row0 Col3: "+sheet.getRow(0).getCell(3).getStringCellValue());
		System.out.println("My Row0 Col4: "+sheet.getRow(0).getCell(4).getStringCellValue());
	}

}
