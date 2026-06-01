package com.automation.framework.utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Excel {
	public Sheet getSheet(String filePath, String sheetName) throws Exception {
		// Code to read data from Excel file
		FileInputStream file = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(file);
		Sheet sheet = wb.getSheet(sheetName);
		return sheet;
	}
	public int getRow(String filePath, String sheetName) throws Exception {
		// Code to read data from Excel file
		FileInputStream file = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(file);
		Sheet sheet = wb.getSheet(sheetName);
		int row = sheet.getPhysicalNumberOfRows();
		return row;
	}
	public int getCel(String filePath, String sheetName) throws Exception {
		// Code to read data from Excel file
		FileInputStream file = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(file);
		Sheet sheet = wb.getSheet(sheetName);
		int row = sheet.getPhysicalNumberOfRows();
		int cell = sheet.getRow(0).getPhysicalNumberOfCells();
		return cell;
	}

}
