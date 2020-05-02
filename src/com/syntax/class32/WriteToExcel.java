package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class WriteToExcel {

	public static void main(String[] args) throws FileNotFoundException {
		String filePath=System.getProperty("user.dir")+"\\testdata.Book1.xlsx";
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Workbook book=new XSSFWorkbook(fis);
		
		
		Sheet sheet1=book.getSheet("Sheet1");
		
		
	}

}
