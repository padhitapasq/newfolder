package com.selendroid.utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readData {

	static XSSFWorkbook wb;
	static XSSFSheet sh1;
	static XSSFRow rw1;

	public static void setPath(String path, String sheetname) throws Throwable {
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		wb = new XSSFWorkbook(fis);
		sh1 = wb.getSheet(sheetname);
	}

	public static String getData(int rowNum, int colNum) {
		rw1 = sh1.getRow(rowNum);
		String cellData = rw1.getCell(colNum).toString();
		return cellData;
	}

}
