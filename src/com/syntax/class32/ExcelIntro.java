package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntro {

	public static void main(String[] args) throws IOException {
		
		String filePath="\\Users\\chuyg\\Documents/Book1.xlsx";
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Workbook wbook=new XSSFWorkbook(fis);
		Sheet sheet=wbook.getSheet("Sheet1");
		//access row
		Row row1=sheet.getRow(0);
		//accessing cell
		Cell cell=row1.getCell(1);
		//get value from cell
		String r=cell.toString();
		System.out.println(r);
		
		//how to get new york
		//Row row3=sheet.getRow(2);
		//Cell rcr3=row3.getCell(2);
		//String cellValue=rcr3.toString();
		//System.out.println(cellValue);
		
		//access va
		cell=sheet.getRow(1).getCell(3);
		System.out.println(cell);
		
		//to retrive values based on type
		double cellv=sheet.getRow(1).getCell(5).getNumericCellValue();
		System.out.println(cellv);
		
		//how to get 222203 in a string format
		String valC=sheet.getRow(1).getCell(5).toString();
		String[] arr=valC.split("\\.");
		System.out.println(arr[0]);
		
		
	}

}
