package com.crm.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class XlUtils {
	
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	
	public static int getRowcount(String Xpath,String Sname) throws IOException {
		
		fi = new FileInputStream(Xpath);
		wb= new XSSFWorkbook(fi);
		ws= wb.getSheet(Sname);
		int rowcount = ws.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;
		
		
	}
public static int getCellCount(String Xpath,String Sname,int rownum) throws IOException {
		
		fi = new FileInputStream(Xpath);
		wb= new XSSFWorkbook(fi);
		ws= wb.getSheet(Sname);
		int cellcount=	ws.getRow(rownum).getLastCellNum();
		wb.close();
		fi.close();
		return cellcount;
		
		
	}
public static String getCellData(String Xpath,String Sname,int rownum,int cellnum) throws IOException {
	
	fi = new FileInputStream(Xpath);
	wb= new XSSFWorkbook(fi);
	ws= wb.getSheet(Sname);
	cell=	ws.getRow(rownum).getCell(cellnum);
	DataFormatter formator = new DataFormatter();
    String celldata=formator.formatCellValue(cell);
	wb.close();
	fi.close();
	return celldata;
	
	
}

public static String setCellData(String Xpath,String Sname,int rownum,int cellnum,String data) throws IOException {
	
	fi = new FileInputStream(Xpath);
	wb= new XSSFWorkbook(fi);
	ws= wb.getSheet(Sname);
	row=	ws.getRow(rownum);
	cell=row.createCell(cellnum);
	cell.setCellValue(data);
	
	fo = new FileOutputStream(Xpath);
	wb.write(fo);
	
	wb.close();
	fi.close();
	fo.close();

	


	
	
	DataFormatter formator = new DataFormatter();
    String celldata=formator.formatCellValue(cell);
	wb.close();
	fi.close();
	return celldata;
	
	
}
	
	
	
	

}
