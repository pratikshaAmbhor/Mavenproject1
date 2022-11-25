package com.HandleProperties_JvaScriptExe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class HandleConfigFile_OutputStream {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\eclipse-workspace\\1stMAVENproject\\ConfigrationFile\\Config1.properties");
		Properties prop = new Properties();
		prop.load(file);
	
		System.out.println("MY Actual data Automation: "+prop.getProperty("Url"));
		
		FileInputStream file2 = new FileInputStream("C:\\Users\\ASUS\\eclipse-workspace\\1stMAVENproject\\ConfigrationFile\\Config1.properties");
		Properties prop2 = new Properties();
		prop.load(file2);
	
		System.out.println("MY Actual data Automation: "+prop.getProperty("url"));

		

		FileOutputStream out = new FileOutputStream("C:\\Users\\ASUS\\eclipse-workspace\\1stMAVENproject\\ConfigrationFile\\Config1.properties");
		prop.setProperty("MyName", "General Info");
		prop.store(out, "Store My First File1");
	
		FileOutputStream out1 = new FileOutputStream("C:\\Users\\ASUS\\eclipse-workspace\\1stMAVENproject\\ConfigrationFile\\Config1.properties");
		prop2.setProperty("MyName", "Basic Info");
		prop2.store(out1, "Store My Second File2");
		
		
	}

}
