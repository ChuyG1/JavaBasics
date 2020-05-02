package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {

	public static void main(String[] args) throws IOException {
		
		//to read the file:
		//1. have file
		String filepath="\\Users\\chuyg\\eclipse-workspace\\JavaBasics\\configs\\Example.properties";
		
		//bring object of fileinputstream
		
		FileInputStream fileinput=new FileInputStream(filepath);
		
		//to handle data from .properties file we need properties class
		
		Properties prop=new Properties();
		prop.load(fileinput);
		
		String name=prop.getProperty("name");
		System.out.println(name);
		
		String city=prop.getProperty("city");
		System.out.println(city);
	
		//getting all keys from property file  4-
		Set<Object> keys=prop.keySet();
		for(Object key:keys) {
			System.out.println(key);
		}
	}

}
