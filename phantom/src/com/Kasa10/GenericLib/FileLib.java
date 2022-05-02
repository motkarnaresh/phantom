package com.Kasa10.GenericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {

	public String readPropertyData(String path, String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		String propValue = prop.getProperty(key, "Incorrct Key");
		return propValue;
	}
	public String readExcelData(String path, String sheet,int row, int cell) throws Throwable
	{
		FileInputStream flib=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(flib);
				
				String excelValue= wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		return excelValue;
	}
	public void writeExcelData(String path,String Sheet,int row,int cell,String data) throws Throwable
	{
		FileInputStream flis= new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(flis);
		wb.getSheet(Sheet).getRow(row).createCell(cell).setCellValue(data);
		
	FileOutputStream fos=new FileOutputStream(path);
	wb.write(fos);
	}
	
	}
	

