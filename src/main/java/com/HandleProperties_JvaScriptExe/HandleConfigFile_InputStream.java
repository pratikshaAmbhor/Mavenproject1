package com.HandleProperties_JvaScriptExe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class HandleConfigFile_InputStream {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\eclipse-workspace\\1stMAVENproject\\ConfigrationFile\\Config.properties");
		Properties prop = new Properties();
		
		prop.load(file);
	//	prop.getProperty("URL");
		
		System.out.println("MY Actual data Automation: "+prop.getProperty("URL"));

		
		
		FileInputStream file1 = new FileInputStream("C:\\Users\\ASUS\\eclipse-workspace\\1stMAVENproject\\ConfigrationFile\\Config.properties");
		Properties prop1 = new Properties();
		prop.load(file1);
		System.out.println("MY Actual data Facebook: "+prop.getProperty("url"));
		
		
		
		FileInputStream file2 = new FileInputStream("C:\\Users\\ASUS\\eclipse-workspace\\1stMAVENproject\\ConfigrationFile\\Config.properties");
		Properties prop2 = new Properties();
		prop.load(file2);
		System.out.println("MY Actual data Myntra: "+prop.getProperty("Url"));
	}

}
